package com.tiny.store.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 后台用户登录/注册请求参数
 *
 * @author EDZ
 */
@Data
public class UmsAdminParam {

  @ApiModelProperty(value = "用户名", required = true)
  @NotBlank(message = "注册名不能为空")
  private String username;

  @ApiModelProperty(value = "密码", required = true)
  @NotBlank(message = "注册密码不能为空")
  private String password;

  @ApiModelProperty(value = "用户头像")
  private String icon;

  @ApiModelProperty(value = "用户邮箱")
  private String email;

  @ApiModelProperty(value = "用户昵称")
  private String nickName;

  @ApiModelProperty(value = "node")
  private String node;
}
