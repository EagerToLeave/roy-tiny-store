package com.roy.mall.common.exception;

/**
 * 通用业务异常类
 * @author EDZ
 */
public class BusinessException extends Exception{

  public BusinessException() {
    super();
  }

  public BusinessException(String message) {
    super(message);
  }


}
