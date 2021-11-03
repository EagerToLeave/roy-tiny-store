package com.tiny.store.auth.service;

import com.tiny.store.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author EDZ
 */
@FeignClient("tiny-admin")
public interface UmsAdminService {

  /**
   * 根据用户名获取用户信息
   * @param username 用户名称
   * @return 用户信息
   */
  @GetMapping("/admin/loadUserByName")
  UserDto loadUserByName(String username);
}
