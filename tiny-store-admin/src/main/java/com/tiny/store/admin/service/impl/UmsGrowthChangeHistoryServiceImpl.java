package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsGrowthChangeHistoryService;
import com.tiny.store.entity.UmsGrowthChangeHistory;
import com.tiny.store.mapper.UmsGrowthChangeHistoryMapper;
import org.springframework.stereotype.Service;

/**
 * 成长值变化历史记录表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsGrowthChangeHistoryServiceImpl
    extends ServiceImpl<UmsGrowthChangeHistoryMapper, UmsGrowthChangeHistory>
    implements UmsGrowthChangeHistoryService {}
