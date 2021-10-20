package com.roy.mall.common.api;

import java.util.Map;
import lombok.Data;

/**
 * 认证服务返回TokenInfo
 * @author EDZ
 */
@Data
public class TokenInfo {

  private String accessToken;

  private String tokenType;

  private String refreshToken;

  private String scope;

  private Map<String, String> additionalInfo;

}
