package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsCouponProductRelationService;
import com.tiny.store.entity.SmsCouponProductRelation;
import com.tiny.store.mapper.SmsCouponProductRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 优惠券和产品的关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsCouponProductRelationServiceImpl
    extends ServiceImpl<SmsCouponProductRelationMapper, SmsCouponProductRelation>
    implements SmsCouponProductRelationService {}
