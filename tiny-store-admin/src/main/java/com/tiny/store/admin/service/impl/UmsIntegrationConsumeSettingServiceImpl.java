package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsIntegrationConsumeSettingService;
import com.tiny.store.entity.UmsIntegrationConsumeSetting;
import com.tiny.store.mapper.UmsIntegrationConsumeSettingMapper;
import org.springframework.stereotype.Service;

/**
 * 积分消费设置 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsIntegrationConsumeSettingServiceImpl
    extends ServiceImpl<UmsIntegrationConsumeSettingMapper, UmsIntegrationConsumeSetting>
    implements UmsIntegrationConsumeSettingService {}
