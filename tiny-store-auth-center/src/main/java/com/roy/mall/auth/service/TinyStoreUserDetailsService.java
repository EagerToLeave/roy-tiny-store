package com.roy.mall.auth.service;

import com.roy.mall.common.service.RedisService;
import com.tiny.store.mapper.UmsMemberMapper;
import com.tiny.store.model.UmsMember;
import java.util.Objects;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 用户服务，用于认证中心用户认证
 *
 * @author EDZ
 */
public class TinyStoreUserDetailsService implements UserDetailsService {

  private final Logger logger = LoggerFactory.getLogger(TinyStoreUserDetailsService.class);

  @Value(value = "redis.expire.common")
  private String REDIS_EXPIRATION;

  @Value(value = "redis.database")
  private String REDIS_DATABASE;

  @Value(value = "redis.key.member")
  private String REDIS_MEMBER;

  @Autowired private RedisService redisService;

  @Autowired private UmsMemberMapper umsMemberMapper;

  /**
   * 用户名验证逻辑
   *
   * @param username 用户名
   * @return
   * @throws UsernameNotFoundException
   */
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    if (StringUtils.isBlank(username)) {
      logger.debug("当前登录用户名为空");
      throw new UsernameNotFoundException("用户名不能为空");
    }

    doLoadUserByUserName(username);

    return null;
  }

  /**
   * 根据登录名获取用户信息
   *
   * @param username 用户名
   * @return
   */
  private UmsMember doLoadUserByUserName(String username) {
    // 此处为提高性能,引入redis缓存
    UmsMember umsMember =
        (UmsMember) redisService.get(REDIS_DATABASE + ":" + REDIS_MEMBER + ":" + username);
    if (Objects.nonNull(umsMember)) {
      return umsMember;
    }
    umsMemberMapper.selectByExample()
    return null;
  }
}
