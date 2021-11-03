package com.tiny.store.auth.config;

import com.tiny.store.auth.enhancer.Oauth2TokenEnhancer;
import com.tiny.store.auth.properties.JwtCAProperties;
import com.tiny.store.auth.service.impl.UserDetailsServiceImpl;
import java.security.KeyPair;
import java.util.Arrays;
import javax.sql.DataSource;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.rsa.crypto.KeyStoreKeyFactory;

/**
 * 认证中心配置类
 *
 * @author EDZ
 */
@AllArgsConstructor
@Configuration
@EnableAuthorizationServer
@EnableConfigurationProperties(value = JwtCAProperties.class)
public class Oauth2ServerConfig extends AuthorizationServerConfigurerAdapter {

  private final AuthenticationManager authenticationManager;

  private final DataSource dataSource;

  private final JwtCAProperties jwtCAProperties;

  private final UserDetailsServiceImpl userDetailsServiceImpl;

  private final PasswordEncoder passwordEncoder;

  /**
   * 记录认证中心需要给哪些服务颁发token，将客户端信息持久化，可选择基于内存/DB
   *
   * @param clients 客户端
   * @throws Exception
   */
  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients
        .inMemory()
        .withClient("admin-app")
        .secret(passwordEncoder.encode("123456"))
        .scopes("all")
        .authorizedGrantTypes("password", "refresh_token")
        .accessTokenValiditySeconds(3600 * 24)
        .refreshTokenValiditySeconds(3600 * 24 * 7)
        .and()
        .withClient("portal-app")
        .secret(passwordEncoder.encode("123456"))
        .scopes("all")
        .authorizedGrantTypes("password", "refresh_token")
        .accessTokenValiditySeconds(3600 * 24)
        .refreshTokenValiditySeconds(3600 * 24 * 7);
  }

  /**
   * 从DB中获取客户端,对应表：oauth_client_details
   *
   * @return
   */
  /*@Bean
  public ClientDetailsService clientDetails() {
    return new JdbcClientDetailsService(dataSource);
  }*/

  /**
   * 认证中心配置
   *
   * @param endpoints
   */
  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
    TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
    tokenEnhancerChain.setTokenEnhancers(
        Arrays.asList(oauthTokenEnhancer(), jwtAccessTokenConverter()));
    // 设置token存储方式
    endpoints
        .tokenEnhancer(tokenEnhancerChain)
        // 校验用户名密码
        .userDetailsService(userDetailsServiceImpl)
        .accessTokenConverter(jwtAccessTokenConverter())
        .authenticationManager(authenticationManager);
  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) {
    // 第三方客户端校验token需要携带clientId和clientSecret
    // security.checkTokenAccess("isAuthenticated()").tokenKeyAccess("isAuthenticated()");
    // 允许表单校验
    security.allowFormAuthenticationForClients();
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
