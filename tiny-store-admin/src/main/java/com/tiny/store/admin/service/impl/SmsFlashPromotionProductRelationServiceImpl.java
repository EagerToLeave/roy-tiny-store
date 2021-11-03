package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsFlashPromotionProductRelationService;
import com.tiny.store.entity.SmsFlashPromotionProductRelation;
import com.tiny.store.mapper.SmsFlashPromotionProductRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 商品限时购与商品关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl
    extends ServiceImpl<SmsFlashPromotionProductRelationMapper, SmsFlashPromotionProductRelation>
    implements SmsFlashPromotionProductRelationService {}
