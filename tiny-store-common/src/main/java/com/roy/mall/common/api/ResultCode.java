package com.roy.mall.common.api;

/** @author EDZ */
public enum ResultCode implements IErrorCode {
  /** 操作状态码及提示信息 */
  SUCCESS(200, "操作成功"),
  FAILED(500, "操作失败"),
  VALIDATE_FAILED(404, "参数校验异常"),
  UNAUTHORIZED(401, "未登录/Token已过期"),
  AUTHORIZATION_HEADER_IS_EMPTY(600, "请求头中token为空"),
  GET_TOKEN_KEY_ERROR(601, "远程获取tokenKey异常"),
  GRN_PUBLIC_KEY_ERROR(602, "公钥生成异常"),
  JWT_TOKEN_EXPIRE_ERROR(603, "token校验异常"),
  TOO_MANY_REQUESTS_ERROR(429, "请求过多,服务流控触发"),
  BACKGROUND_DEGRADED_ERROR(604, "请求过多,服务降级触发"),
  BAD_GATEWAY(502, "网关服务异常"),
  FORBIDDEN(403, "暂无权限");

  private long code;

  private String message;

  ResultCode(long code, String message) {
    this.code = code;
    this.message = message;
  }

  @Override
  public long getCode() {
    return this.code;
  }

  @Override
  public String getMessage() {
    return this.message;
  }
}
