package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsIntegrationChangeHistoryService;
import com.tiny.store.entity.UmsIntegrationChangeHistory;
import com.tiny.store.mapper.UmsIntegrationChangeHistoryMapper;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsIntegrationChangeHistoryServiceImpl
    extends ServiceImpl<UmsIntegrationChangeHistoryMapper, UmsIntegrationChangeHistory>
    implements UmsIntegrationChangeHistoryService {}
