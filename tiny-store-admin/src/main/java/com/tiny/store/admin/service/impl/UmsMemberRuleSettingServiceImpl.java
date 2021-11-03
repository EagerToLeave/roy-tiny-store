package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberRuleSettingService;
import com.tiny.store.entity.UmsMemberRuleSetting;
import com.tiny.store.mapper.UmsMemberRuleSettingMapper;
import org.springframework.stereotype.Service;

/**
 * 会员积分成长规则表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberRuleSettingServiceImpl
    extends ServiceImpl<UmsMemberRuleSettingMapper, UmsMemberRuleSetting>
    implements UmsMemberRuleSettingService {}
