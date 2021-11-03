package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsCouponProductCategoryRelationService;
import com.tiny.store.entity.SmsCouponProductCategoryRelation;
import com.tiny.store.mapper.SmsCouponProductCategoryRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 优惠券和产品分类关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsCouponProductCategoryRelationServiceImpl
    extends ServiceImpl<SmsCouponProductCategoryRelationMapper, SmsCouponProductCategoryRelation>
    implements SmsCouponProductCategoryRelationService {}
