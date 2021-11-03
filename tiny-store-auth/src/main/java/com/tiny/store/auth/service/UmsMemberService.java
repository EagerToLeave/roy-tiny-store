package com.tiny.store.auth.service;

import com.tiny.store.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author EDZ
 */
@FeignClient("tiny-portal")
public interface UmsMemberService {

  /**
   * 根据名称获取用户信息
   * @param username 用户名称
   * @return 用户信息
   */
  @GetMapping("/sso/loadUserByName")
  UserDto loadUserByName(String username);

}
