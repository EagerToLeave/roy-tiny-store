package com.roy.mall.auth.service;

import com.roy.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈根据用户名获取后台用户信息〉
 *
 * @author roy
 * @create 2021/10/24
 * @since 1.0.0
 */
@FeignClient("tiny-store-admin")
public interface UmsAdminService {

  /**
   * 根据用户名加载用户信息
   *
   * @param username 用户名
   * @return 用户信息
   */
  @GetMapping("/admin/loadByName")
  UserDto loadUserByUsername(@RequestParam String username);
}
