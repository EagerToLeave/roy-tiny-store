package com.roy.mall.auth.service;

import com.roy.mall.auth.domain.MemberDetails;
import com.roy.mall.common.service.RedisService;
//import com.tiny.store.fluent.entity.UmsMemberEntity;
//import com.tiny.store.model.UmsMember;
//import com.tiny.store.fluent.repository.UmsMemberRepository;
import com.tiny.store.fluent.dao.impl.UmsMemberDaoImpl;
import com.tiny.store.fluent.dao.intf.UmsMemberDao;
import com.tiny.store.fluent.entity.UmsMemberEntity;
import com.tiny.store.fluent.mapper.UmsMemberMapper;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Resource;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class TinyStoreUserDetailsService implements UserDetailsService {

  private final Logger logger = LoggerFactory.getLogger(TinyStoreUserDetailsService.class);

  @Value(value = "${redis.expire.common}")
  private Long REDIS_EXPIRATION;

  @Value(value = "${redis.database}")
  private String REDIS_DATABASE;

  @Value(value = "${redis.key.member}")
  private String REDIS_MEMBER;

  @Autowired
  private RedisService redisService;

  @Autowired
  private UmsMemberDao umsMemberDao;

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
    //UmsMemberEntity umsMember = doLoadUserByUserName(username);
//    return new MemberDetails(umsMember);
    return null;
  }

  /**
   * 根据登录名获取用户信息
   *
   * @param username 用户名
   * @return
   */
  private UmsMemberEntity doLoadUserByUserName(String username) {
    // 引入redis缓存
    String key = REDIS_DATABASE + ":" + REDIS_MEMBER + ":" + username;
    UmsMemberEntity umsMember = (UmsMemberEntity) redisService.get(key);
    if (Objects.nonNull(umsMember)) {
      return umsMember;
    }
    // 根据用户名查询DB
    Optional<UmsMemberEntity> memberInfo = umsMemberDao.getMemberInfoByName(username);
    umsMember = memberInfo.orElseThrow(() -> new UsernameNotFoundException("查询到的member为空!"));
    // 存入redis
    redisService.set(key, umsMember, REDIS_EXPIRATION);
    return umsMember;
  }
}
