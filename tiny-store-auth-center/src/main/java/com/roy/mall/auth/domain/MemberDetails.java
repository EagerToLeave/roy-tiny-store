package com.roy.mall.auth.domain;

//import com.tiny.store.fluent.entity.UmsMemberEntity;
import com.tiny.store.fluent.entity.UmsMemberEntity;
import java.util.Collection;
import java.util.Collections;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 登陆人员信息
 *
 * @author EDZ
 */
@Getter
public class MemberDetails implements UserDetails {

  private UmsMemberEntity umsMember;

  public MemberDetails(UmsMemberEntity umsMember) {
    this.umsMember = umsMember;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // 返回当前用户权限
    // todo 目前统一设置为TEST，待调整
    return Collections.singletonList(new SimpleGrantedAuthority("TEST"));
  }

  @Override
  public String getPassword() {
    return umsMember.getPassword();
  }

  @Override
  public String getUsername() {
    return umsMember.getUsername();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return umsMember.getStatus() == 1;
  }
}
