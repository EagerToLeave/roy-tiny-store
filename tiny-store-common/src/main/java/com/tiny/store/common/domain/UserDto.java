package com.tiny.store.common.domain;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录信息
 *
 * @author EDZ
 */
@Data
@NoArgsConstructor
public class UserDto {

  /** 用户id */
  private Long id;
  /** 用户名 */
  private String username;
  /** 用户密码 */
  private String password;
  /** 用户状态 */
  private Integer status;
  /** 客户端id */
  private String clientId;
  /** 用户角色 */
  private List<String> roles;
}
