package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductCategoryAttributeRelationService;
import com.tiny.store.entity.PmsProductCategoryAttributeRelation;
import com.tiny.store.mapper.PmsProductCategoryAttributeRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl
    extends ServiceImpl<
        PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation>
    implements PmsProductCategoryAttributeRelationService {}
