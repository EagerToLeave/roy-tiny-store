package com.tiny.store.auth.interfaces;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.RSAKey.Builder;
import io.swagger.annotations.ApiOperation;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户端获取RSA公钥接口
 *
 * @author EDZ
 */
@AllArgsConstructor
@RestController
@RequestMapping("/rsa")
public class KeyPairController {

  private final KeyPair keyPair;

  @ApiOperation(value = "获取RSA公钥")
  @GetMapping("/publicKey")
  public Map<String, Object> getPubKey() {
    RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
    RSAKey rsaKey = new Builder(publicKey).build();
    return new JWKSet(rsaKey).toJSONObject();
  }
}
