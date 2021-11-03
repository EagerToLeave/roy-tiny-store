package com.tiny.store.auth.interfaces;

import com.tiny.store.auth.domain.Oauth2TokenDto;
import com.tiny.store.common.api.CommonResult;
import com.tiny.store.common.constant.AuthConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.security.Principal;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 认证中心获取令牌接口
 *
 * @author EDZ
 */
@Api(tags = "AuthController", description = "认证中心登录")
@RestController
@RequestMapping("/oauth")
public class AuthController {

  @Autowired private TokenEndpoint tokenEndpoint;

  @ApiOperation(value = "Oauth2 获取token令牌")
  @ApiImplicitParams({
    @ApiImplicitParam(name = "grant_type", value = "授权模式", required = true),
    @ApiImplicitParam(name = "client_id", value = "客户端id", required = true),
    @ApiImplicitParam(name = "client_secret", value = "Oauth2客户端密钥", required = true),
    @ApiImplicitParam(name = "refresh_token", value = "刷新后token", required = false),
    @ApiImplicitParam(name = "username", value = "用户名", required = true),
    @ApiImplicitParam(name = "password", value = "登录密码", required = true)
  })
  @PostMapping("/access/token")
  public CommonResult<Oauth2TokenDto> getAccessToken(
      @ApiIgnore Principal principal, @ApiIgnore @RequestParam Map<String, String> parameters)
      throws HttpRequestMethodNotSupportedException {
    // 调用Oauth2生成token
    OAuth2AccessToken oAuth2AccessToken =
        tokenEndpoint.postAccessToken(principal, parameters).getBody();
    OAuth2AccessToken accessToken =
        Optional.ofNullable(oAuth2AccessToken).orElseThrow(NullPointerException::new);
    Oauth2TokenDto tokenDto =
        Oauth2TokenDto.builder()
            .token(accessToken.getValue())
            .refreshToken(accessToken.getRefreshToken().getValue())
            .tokenHeader(AuthConstant.JWT_TOKEN_PREFIX)
            .expiresIn(accessToken.getExpiresIn())
            .build();
    return CommonResult.success(tokenDto);
  }
}
