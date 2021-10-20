package com.roy.mall.auth.config;

import com.roy.mall.auth.enhancer.Oauth2TokenEnhancer;
import com.roy.mall.auth.properties.JwtCAProperties;
import com.roy.mall.auth.service.TinyStoreUserDetailsService;
import java.security.KeyPair;
import java.util.Arrays;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

/**
 * 认证中心配置类
 *
 * @author EDZ
 */
@Configuration
@EnableAuthorizationServer
@EnableConfigurationProperties(value = JwtCAProperties.class)
public class Oauth2ServerConfig extends AuthorizationServerConfigurerAdapter {

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private DataSource dataSource;

  @Resource
  private JwtCAProperties jwtCAProperties;

  @Autowired
  private TinyStoreUserDetailsService tinyStoreUserDetailsService;

  /**
   * 记录认证中心需要给哪些服务颁发token，将客户端信息持久化，可选择基于内存/DB
   *
   * @param clients 客户端
   * @throws Exception
   */
  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients.withClientDetails(clientDetails());
  }

  /**
   * 从DB中获取客户端,对应表：oauth_client_details
   *
   * @return
   */
  @Bean
  public ClientDetailsService clientDetails() {
    return new JdbcClientDetailsService(dataSource);
  }

  /**
   * 认证中心配置
   *
   * @param endpoints
   * @throws Exception
   */
  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
    tokenEnhancerChain.setTokenEnhancers(
        Arrays.asList(oauthTokenEnhancer(), jwtAccessTokenConverter()));
    // 设置token存储方式
    endpoints
        .tokenStore(tokenStore())
        .tokenEnhancer(tokenEnhancerChain)
        // 校验用户名密码
        .userDetailsService(tinyStoreUserDetailsService)
        .authenticationManager(authenticationManager);
  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
    // 第三方客户端校验token需要携带clientId和clientSecret
    security.checkTokenAccess("isAuthenticated()").tokenKeyAccess("isAuthenticated()");
  }

  @Bean
  public TokenStore tokenStore() {
    return new JwtTokenStore(jwtAccessTokenConverter());
  }

  @Bean
  public JwtAccessTokenConverter jwtAccessTokenConverter() {
    JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
    jwtAccessTokenConverter.setKeyPair(keyPair());
    return jwtAccessTokenConverter;
  }

  private KeyPair keyPair() {
    KeyStoreKeyFactory keyFactory =
        new KeyStoreKeyFactory(
            new ClassPathResource(jwtCAProperties.getKeyPairName()),
            jwtCAProperties.getKeyPairSecret().toCharArray());
    return keyFactory.getKeyPair(
        jwtCAProperties.getKeyPairAlias(), jwtCAProperties.getKeyPairStoreSecret().toCharArray());
  }

  @Bean
  public Oauth2TokenEnhancer oauthTokenEnhancer() {
    return new Oauth2TokenEnhancer();
  }
}
