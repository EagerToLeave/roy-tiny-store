package com.tiny.store.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.constant.AdminUserConstants;
import com.tiny.store.admin.convert.UmsAdminConverter;
import com.tiny.store.admin.dto.UmsAdminLoginParam;
import com.tiny.store.admin.dto.UmsAdminParam;
import com.tiny.store.admin.rpc.AuthService;
import com.tiny.store.admin.service.UmsAdminCacheService;
import com.tiny.store.admin.service.UmsAdminService;
import com.tiny.store.common.api.CommonResult;
import com.tiny.store.common.api.ResultCode;
import com.tiny.store.common.domain.UserDto;
import com.tiny.store.common.exception.ApiException;
import com.tiny.store.common.exception.Asserts;
import com.tiny.store.entity.UmsAdmin;
import com.tiny.store.mapper.UmsAdminMapper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 后台用户表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
@AllArgsConstructor
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin>
    implements UmsAdminService {

  private final AuthService authService;
  private final UmsAdminCacheService adminCacheService;
  private final UmsAdminMapper umsAdminMapper;
  private final PasswordEncoder passwordEncoder;
  private final HttpServletRequest httpServletRequest;

  /**
   * 用户注册服务
   *
   * @param param 用户注册信息
   * @return 注册结果
   */
  @Override
  public UmsAdmin register(UmsAdminParam param) {
    UmsAdmin umsAdmin = UmsAdminConverter.INSTANCE.convertToAdmin(param);
    umsAdmin.setCreateTime(LocalDateTime.now());
    umsAdmin.setStatus(AdminUserConstants.COMMON_STATUS);
    // 是否已存在相同名称用户
    QueryWrapper<UmsAdmin> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("username", umsAdmin.getUsername());
    UmsAdmin isExists = umsAdminMapper.selectOne(queryWrapper);
    Optional.ofNullable(isExists)
        .ifPresent(
            admin -> {
              throw new ApiException("请更换用户名后重新注册");
            });
    // 对用户密码加密
    String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
    umsAdmin.setPassword(encodePassword);
    // 新注册用户入库
    umsAdminMapper.insert(umsAdmin);
    return umsAdmin;
  }

  /**
   * 后台用户登录服务
   *
   * @param param 用户登录信息
   * @return token
   */
  @Override
  public CommonResult login(UmsAdminLoginParam param) {
    Map<String, Object> paramMap = BeanUtil.beanToMap(param);
    CommonResult accessToken = authService.getAccessToken(paramMap);
    // 校验accessaToken请求结果
    if (ResultCode.SUCCESS.getCode() == accessToken.getCode()
        && Objects.nonNull(accessToken.getData())) {
      return accessToken;
    }
    return CommonResult.failed(ResultCode.GEN_TOKEN_ERROR);
  }

  /**
   * 获取当前登录用户信息
   *
   * @return
   */
  @Override
  public UmsAdmin getCurrentAdmin(String userStr) {
    if (StringUtils.isEmpty(userStr)) {
      Asserts.fail(ResultCode.UNAUTHORIZED);
    }
    UserDto userDto = JSONUtil.toBean(userStr, UserDto.class);
    UmsAdmin umsAdmin = adminCacheService.getUmsAdmin(userDto.getId());
    if (Objects.nonNull(umsAdmin)) {
      return umsAdmin;
    }
    umsAdmin = umsAdminMapper.selectById(userDto.getId());
    adminCacheService.setAdmin(umsAdmin);
    return umsAdmin;
  }

  /**
   * 用户登出
   *
   * @param userInfo 用户登录信息
   * @return 是否成功
   */
  @Override
  public Boolean logout(String userInfo) {
    UserDto userDto = JSONUtil.toBean(userInfo, UserDto.class);
    return adminCacheService.removeUmsAdmin(userDto.getId());
  }
}
