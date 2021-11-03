package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberProductCategoryRelationService;
import com.tiny.store.entity.UmsMemberProductCategoryRelation;
import com.tiny.store.mapper.UmsMemberProductCategoryRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberProductCategoryRelationServiceImpl
    extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation>
    implements UmsMemberProductCategoryRelationService {}
