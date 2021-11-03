package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsFlashPromotionSessionService;
import com.tiny.store.entity.SmsFlashPromotionSession;
import com.tiny.store.mapper.SmsFlashPromotionSessionMapper;
import org.springframework.stereotype.Service;

/**
 * 限时购场次表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsFlashPromotionSessionServiceImpl
    extends ServiceImpl<SmsFlashPromotionSessionMapper, SmsFlashPromotionSession>
    implements SmsFlashPromotionSessionService {}
