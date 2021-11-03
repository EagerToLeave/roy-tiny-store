package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OauthAccessTokenService;
import com.tiny.store.entity.OauthAccessToken;
import com.tiny.store.mapper.OauthAccessTokenMapper;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OauthAccessTokenServiceImpl
    extends ServiceImpl<OauthAccessTokenMapper, OauthAccessToken>
    implements OauthAccessTokenService {}
