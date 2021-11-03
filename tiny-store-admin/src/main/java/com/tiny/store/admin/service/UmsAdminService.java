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
public interface UmsAdminService extends IService<UmsAdmin> {

  /**
   * 用户注册服务
   * @param param 用户注册信息
   * @return 注册结果
   */
  UmsAdmin register(UmsAdminParam param);

  /**
   * 后台用户登录服务
   * @param param 用户登录信息
   * @return token
   */
  CommonResult login(UmsAdminLoginParam param);

  /**
   * 获取当前登录用户信息
   * @param 用户登录信息
   * @return 用户登录信息
   */
  UmsAdmin getCurrentAdmin(String userInfo);

  /**
   * 用户登出
   * @param userInfo 用户登录信息
   * @return 是否成功
   */
  Boolean logout(String userInfo);

}
