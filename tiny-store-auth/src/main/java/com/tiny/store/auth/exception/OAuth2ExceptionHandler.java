package com.tiny.store.auth.exception;

import com.tiny.store.common.api.CommonResult;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * OAuth2全局异常处理
 *
 * @author EDZ
 */
@ControllerAdvice
public class OAuth2ExceptionHandler {

  @ResponseBody
  @ExceptionHandler(value = OAuth2Exception.class)
  public CommonResult handleException(OAuth2Exception exception) {
    return CommonResult.failed(exception.getMessage());
  }
}
