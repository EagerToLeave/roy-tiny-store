package com.tiny.store.admin.service.impl;

import com.tiny.store.admin.service.UmsAdminCacheService;
import com.tiny.store.admin.service.UmsAdminService;
import com.tiny.store.common.service.RedisService;
import com.tiny.store.entity.UmsAdmin;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/** @author EDZ */
@AllArgsConstructor
@Service("umsAdminCacheService")
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {

  private final UmsAdminService umsAdminService;

  private final RedisService redisService;

  @Value("${redis.database}")
  private String REDIS_DATABASE;

  @Value("${redis.expire.common}")
  private Long REDIS_EXPIRE;

  @Value("${redis.key.admin}")
  private String REDIS_KEY_ADMIN;

  /**
   * 移除后台用户登录缓存信息
   *
   * @param userId 用户id
   * @return 是否成功
   */
  @Override
  public Boolean removeUmsAdmin(Long userId) {
    String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + userId;
    return redisService.del(key);
  }

  /**
   * 获取用户登录缓存信息
   *
   * @param userId 用户id
   * @return 用户缓存信息
   */
  @Override
  public UmsAdmin getUmsAdmin(Long userId) {
    String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + userId;
    return (UmsAdmin) redisService.get(key);
  }

  /**
   * 设置用户缓存信息
   *
   * @param admin 用户登录信息
   * @return 是否成功
   */
  @Override
  public Boolean setAdmin(UmsAdmin admin) {
    String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + "" + admin.getId();
    redisService.set(key, admin, REDIS_EXPIRE);
    return true;
  }
}
