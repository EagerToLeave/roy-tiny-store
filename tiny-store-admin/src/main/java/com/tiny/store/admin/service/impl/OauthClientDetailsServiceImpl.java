package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OauthClientDetailsService;
import com.tiny.store.entity.OauthClientDetails;
import com.tiny.store.mapper.OauthClientDetailsMapper;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OauthClientDetailsServiceImpl
    extends ServiceImpl<OauthClientDetailsMapper, OauthClientDetails>
    implements OauthClientDetailsService {}
