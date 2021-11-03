package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OauthApprovalsService;
import com.tiny.store.entity.OauthApprovals;
import com.tiny.store.mapper.OauthApprovalsMapper;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OauthApprovalsServiceImpl extends ServiceImpl<OauthApprovalsMapper, OauthApprovals>
    implements OauthApprovalsService {}
