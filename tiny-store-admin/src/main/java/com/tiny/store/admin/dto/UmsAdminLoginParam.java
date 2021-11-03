package com.tiny.store.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 用户登录请求参数
 *
 * @author EDZ
 */
@Data
public class UmsAdminLoginParam {

  @ApiModelProperty(value = "用户名", required = true)
  @NotEmpty(message = "用户名不能为空")
  private String username;

  @ApiModelProperty(value = "密码", required = true)
  @NotEmpty(message = "用户密码不能为空")
  private String password;
}
