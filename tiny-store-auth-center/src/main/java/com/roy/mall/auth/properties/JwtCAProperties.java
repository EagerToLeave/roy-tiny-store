package com.roy.mall.auth.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * CA证书属性
 * @author EDZ
 */
@Data
@ConfigurationProperties(prefix = "tiny-store.jwt")
public class JwtCAProperties {

  private String keyPairName;

  private String keyPairAlias;

  private String keyPairSecret;

  private String keyPairStoreSecret;

}
