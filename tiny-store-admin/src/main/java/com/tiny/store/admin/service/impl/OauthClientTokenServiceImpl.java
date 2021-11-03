package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OauthClientTokenService;
import com.tiny.store.entity.OauthClientToken;
import com.tiny.store.mapper.OauthClientTokenMapper;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OauthClientTokenServiceImpl
    extends ServiceImpl<OauthClientTokenMapper, OauthClientToken>
    implements OauthClientTokenService {}
