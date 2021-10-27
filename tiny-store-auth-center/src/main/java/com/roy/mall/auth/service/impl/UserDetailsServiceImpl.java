package com.roy.mall.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.roy.mall.auth.domain.MemberDetails;
import com.roy.mall.common.service.RedisService;
import com.tiny.store.entity.UmsMember;
import com.tiny.store.mapper.UmsMemberMapper;
import java.util.Objects;
import java.util.Optional;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 用户服务，用于认证中心用户认证
 *
 * @author EDZ
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

  private final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

  @Value(value = "${redis.expire.common}")
  private Long REDIS_EXPIRATION;

  @Value(value = "${redis.database}")
  private String REDIS_DATABASE;

  @Value(value = "${redis.key.member}")
  private String REDIS_MEMBER;

  @Autowired
  private RedisService redisService;

  @Autowired
  private UmsMemberMapper umsMemberMapper;

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
      this.logger.debug("当前登录用户名为空");
      throw new UsernameNotFoundException("用户名不能为空");
    }
    UmsMember umsMember = this.doLoadUserByUserName(username);
    return new MemberDetails(umsMember);
  }

  /**
   * 根据登录名获取用户信息
   *
   * @param username 用户名
   * @return
   */
  private UmsMember doLoadUserByUserName(String username) {
    // 引入redis缓存
    String key = this.REDIS_DATABASE + ":" + this.REDIS_MEMBER + ":" + username;
    UmsMember umsMember = (UmsMember) this.redisService.get(key);
    if (Objects.nonNull(umsMember)) {
      logger.debug("redis is null:{}", key);
      return umsMember;
    }
    // 根据用户名查询DB
    QueryWrapper<UmsMember> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("username", username);
    Optional<UmsMember> memberInfo =
        Optional.ofNullable(this.umsMemberMapper.selectOne(queryWrapper));
    umsMember = memberInfo.orElseThrow(() -> new UsernameNotFoundException("查询到的member为空!"));
    // 存入redis
    this.redisService.set(key, umsMember, this.REDIS_EXPIRATION);
    return umsMember;
  }
}
