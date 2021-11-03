package com.tiny.store.admin.rpc;

import com.tiny.store.common.api.CommonResult;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author EDZ
 */
@FeignClient("tiny-auth")
public interface AuthService {

  /**
   * 调用tiny-auth服务获取用户Token
   * @param params
   * @return
   */
  @PostMapping(value = "/oauth/access/token")
  CommonResult getAccessToken(Map<String, Object> params);

}
