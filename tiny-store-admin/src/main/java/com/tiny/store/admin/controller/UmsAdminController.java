package com.tiny.store.admin.controller;

import com.tiny.store.admin.constant.AdminUserConstants;
import com.tiny.store.admin.dto.UmsAdminLoginParam;
import com.tiny.store.admin.dto.UmsAdminParam;
import com.tiny.store.admin.service.UmsAdminService;
import com.tiny.store.common.api.CommonResult;
import com.tiny.store.common.constant.AuthConstant;
import com.tiny.store.entity.UmsAdmin;
import io.swagger.annotations.ApiOperation;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台用户表 前端控制器
 *
 * @author roy
 * @since 2021-11-01
 */
@AllArgsConstructor
@RestController
@RequestMapping("/store/admin")
public class UmsAdminController {

  private final UmsAdminService umsAdminService;

  @ApiOperation(value = "用户注册", notes = "后台用户管理", httpMethod = "POST")
  @PostMapping("/register")
  public CommonResult<UmsAdmin> register(@Validated @RequestBody UmsAdminParam param) {
    UmsAdmin umsAdmin = umsAdminService.register(param);
    if (Objects.isNull(umsAdmin)) {
      return CommonResult.failed(AdminUserConstants.REGISTER_FAILED);
    }
    return CommonResult.success(umsAdmin);
  }

  @ApiOperation(value = "后台用户登录", notes = "后台用户管理", httpMethod = "POST")
  @PostMapping("")
  public CommonResult login(@Validated @RequestBody UmsAdminLoginParam param) {
    return umsAdminService.login(param);
  }

  @ApiOperation(value = "获取当前用户登录信息", notes = "后台用户管理", httpMethod = "POST")
  @GetMapping("/info")
  public CommonResult<UmsAdmin> getUserInfo(
      @RequestHeader(value = AuthConstant.USER_TOKEN_HEADER) String userStr) {
    UmsAdmin umsAdmin = umsAdminService.getCurrentAdmin(userStr);
    return CommonResult.success(umsAdmin);
  }

  @ApiOperation(value = "用户登出", notes = "用户后台管路", httpMethod = "POST")
  @PostMapping("/logout")
  public CommonResult<Boolean> logout(
      @RequestHeader(value = AuthConstant.USER_TOKEN_HEADER) String userStr) {

    return null;
  }
}
