package com.tiny.store.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tiny.store.auth.constant.MessageConstant;
import com.tiny.store.auth.domain.SecurityUser;
import com.tiny.store.auth.service.UmsAdminService;
import com.tiny.store.auth.service.UmsMemberService;
import com.tiny.store.common.constant.AuthConstant;
import com.tiny.store.common.domain.UserDto;
import com.tiny.store.entity.UmsMember;
import com.tiny.store.mapper.UmsMemberMapper;
import java.util.Objects;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/** @author EDZ */
@Slf4j
@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UmsMemberMapper umsMemberMapper;

  private final UmsAdminService umsAdminService;

  private final UmsMemberService umsMemberService;

  private final HttpServletRequest httpRequest;

  /**
   * 根据用户名获取用户信息
   *
   * @param username
   * @return
   * @throws UsernameNotFoundException
   */
  @SneakyThrows
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    if (StringUtils.isBlank(username)) {
      log.warn("用户名不能为空");
      throw new UsernameNotFoundException("用户名不能为空");
    }

    // 根据客户端请i去来源获取相关模块用户信息
    String client_id = httpRequest.getParameter("client_id");
    UserDto userInfo = new UserDto();
    if (AuthConstant.ADMIN_CLIENT_ID.equals(client_id)) {
      userInfo = umsAdminService.loadUserByName(username);
    } else {
      userInfo = umsMemberService.loadUserByName(username);
    }
    if (Objects.isNull(userInfo)) {
      throw new UsernameNotFoundException(MessageConstant.USERNAME_PASSWORD_ERROR);
    }
    userInfo.setClientId(client_id);
    SecurityUser securityUser = new SecurityUser(userInfo);
    if (!securityUser.isEnabled()) {
      throw new DisabledException(MessageConstant.ACCOUNT_DISABLED);
    } else if (!securityUser.isAccountNonLocked()) {
      throw new LockedException(MessageConstant.ACCOUNT_LOCKED);
    } else if (!securityUser.isAccountNonExpired()) {
      throw new AccountExpiredException(MessageConstant.ACCOUNT_EXPIRED);
    } else if (!securityUser.isCredentialsNonExpired()) {
      throw new CredentialsExpiredException(MessageConstant.CREDENTIALS_EXPIRED);
    }
    return securityUser;
  }

  /**
   * 根据用户名查询DB获取信息
   *
   * @param username
   * @return
   */
  private Optional<UmsMember> getUserByName(String username) {
    QueryWrapper<UmsMember> umsMemberQueryWrapper = new QueryWrapper<>();
    umsMemberQueryWrapper.eq("username", username);
    return Optional.ofNullable(umsMemberMapper.selectOne(umsMemberQueryWrapper));
  }
}
