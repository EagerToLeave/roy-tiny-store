package com.tiny.store.auth.enhancer;

import com.tiny.store.auth.domain.MemberDetails;
import java.util.HashMap;
import java.util.Map;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

/**
 * jwt 自定义内容增强
 *
 * @author EDZ
 */
public class Oauth2TokenEnhancer implements TokenEnhancer {

  @Override
  public OAuth2AccessToken enhance(
      OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
    // 获取登录人员信息
    MemberDetails memberDetails = (MemberDetails) authentication.getPrincipal();
    // 将用户常用信息额外载入token
    final Map<String, Object> additionalData = new HashMap<>(16);
    final Map<String, Object> additionalInfo = new HashMap<>(16);
    // 用户id
    additionalData.put("memberId", memberDetails.getUmsMember().getId());
    // 用户昵称
    additionalData.put("nickName", memberDetails.getUmsMember().getNickname());
    // 用户积分
    additionalData.put("integration", memberDetails.getUmsMember().getIntegration());

    additionalInfo.put("additionalInfo", additionalInfo);
    ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
    return accessToken;
  }
}
