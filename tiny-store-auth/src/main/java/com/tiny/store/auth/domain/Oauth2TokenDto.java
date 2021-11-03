package com.tiny.store.auth.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Oauth2 token返回结果
 * @author EDZ
 */
@Data
@Builder
public class Oauth2TokenDto {
  @ApiModelProperty(value = "token令牌")
  private String token;

  @ApiModelProperty(value = "刷新后token令牌")
  private String refreshToken;

  @ApiModelProperty(value = "封装后请求头")
  private String tokenHeader;

  @ApiModelProperty(value = "令牌有效时间(s)")
  private Integer expiresIn;

}
