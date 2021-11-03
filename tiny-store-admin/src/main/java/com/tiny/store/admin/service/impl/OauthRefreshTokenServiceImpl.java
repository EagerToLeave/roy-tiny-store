package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OauthRefreshTokenService;
import com.tiny.store.entity.OauthRefreshToken;
import com.tiny.store.mapper.OauthRefreshTokenMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OauthRefreshTokenServiceImpl extends ServiceImpl<OauthRefreshTokenMapper, OauthRefreshToken> implements
    OauthRefreshTokenService {

}
