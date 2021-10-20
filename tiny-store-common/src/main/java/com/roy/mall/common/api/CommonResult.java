package com.roy.mall.common.api;

import lombok.Data;

/**
 * 通用返回结果封装
 * @author EDZ
 */
@Data
public class CommonResult<T> {

  private Long code;

  private String message;

  private T data;

  public CommonResult(Long code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  /**
   * 操作成功返回结果
   * @param data 返回成功数据
   * @return
   */
  public static <T> CommonResult<T> success(T data){
    return new CommonResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
  }

  /**
   * 操作成功返回结果，并添加自定义返回信息
   * @param data 数据
   * @param message 自定义返回信息
   * @return
   */
  public static <T> CommonResult<T> success(T data, String message){
    return new CommonResult<>(ResultCode.SUCCESS.getCode(), message, data);
  }

  /**
   * 操作失败返回结果
   * @param errorCode 错误码
   * @return
   */
  public static <T> CommonResult<T> failed(IErrorCode errorCode){
    return new CommonResult<>(errorCode.getCode(), errorCode.getMessage(), null);
  }

  /**
   * 操作失败返回结果，并添加自定义提示信息
   * @param message 自定义提示信息
   * @return
   */
  public static <T> CommonResult<T> failed(String message){
    return new CommonResult<>(ResultCode.FAILED.getCode(), message,null);
  }

  /**
   * 操作失败返回结果，添加自定义数据及自定义提示信息
   * @param data 自定义数据
   * @param message 自定义提示信息
   * @return
   */
  public static <T> CommonResult<T> failed(T data, String message){
    return new CommonResult<>(ResultCode.FAILED.getCode(), message, data);
  }

  /**
   * 操作失败直接返回
   * @return
   */
  public static <T> CommonResult<T> failed(){
    return failed(ResultCode.FAILED);
  }

  /**
   * 参数校验失败后返回结果，添加自定义提示信息
   * @param message 提示信息
   * @return
   */
  public static <T> CommonResult<T> validateFailed(String message){
    return new CommonResult<>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
  }

  /**
   * 登录校验未通过返回结果
   * @param data 自定义返回数据
   * @return
   */
  public static <T> CommonResult<T> unauthorized(T data){
    return new CommonResult<>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
  }

  /**
   * 权限校验失败返回结果
   * @param data 自定义返回数据
   * @return
   */
  public static <T> CommonResult<T> forbidden(T data){
    return new CommonResult<>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
  }
}
