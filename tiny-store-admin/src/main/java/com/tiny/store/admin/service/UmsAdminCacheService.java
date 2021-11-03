package com.tiny.store.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tiny.store.admin.dto.UmsAdminLoginParam;
import com.tiny.store.admin.dto.UmsAdminParam;
import com.tiny.store.common.api.CommonResult;
import com.tiny.store.entity.UmsAdmin;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
public interface UmsAdminCacheService {

  /**
   * 移除后台用户登录缓存信息
   * @param userId 用户id
   * @return 是否成功
   */
  Boolean removeUmsAdmin(Long userId);

  /**
   * 获取用户登录缓存信息
   * @param userId 用户id
   * @return 用户缓存信息
   */
  UmsAdmin getUmsAdmin(Long userId);

  /**
   * 设置用户缓存信息
   * @param admin 用户登录信息
   * @return 是否成功
   */
  Boolean setAdmin(UmsAdmin admin);
}
