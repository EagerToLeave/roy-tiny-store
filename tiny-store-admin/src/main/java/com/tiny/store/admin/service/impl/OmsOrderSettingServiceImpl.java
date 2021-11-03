package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsOrderSettingService;
import com.tiny.store.entity.OmsOrderSetting;
import com.tiny.store.mapper.OmsOrderSettingMapper;
import org.springframework.stereotype.Service;

/**
 * 订单设置表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting>
    implements OmsOrderSettingService {}
