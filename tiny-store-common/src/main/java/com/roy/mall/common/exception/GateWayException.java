package com.roy.mall.common.exception;

import com.roy.mall.common.api.IErrorCode;

/**
 * 网关异常
 * @author EDZ
 */
public class GateWayException extends RuntimeException{

  private long code;

  private String message;

  public GateWayException(IErrorCode errorCode) {
    this.code = errorCode.getCode();
    this.message = errorCode.getMessage();
  }
}
