package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsFlashPromotionLogService;
import com.tiny.store.entity.SmsFlashPromotionLog;
import com.tiny.store.mapper.SmsFlashPromotionLogMapper;
import org.springframework.stereotype.Service;

/**
 * 限时购通知记录 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsFlashPromotionLogServiceImpl
    extends ServiceImpl<SmsFlashPromotionLogMapper, SmsFlashPromotionLog>
    implements SmsFlashPromotionLogService {}
