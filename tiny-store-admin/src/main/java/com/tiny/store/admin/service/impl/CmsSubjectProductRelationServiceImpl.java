package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsSubjectProductRelationService;
import com.tiny.store.entity.CmsSubjectProductRelation;
import com.tiny.store.mapper.CmsSubjectProductRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 专题商品关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsSubjectProductRelationServiceImpl
    extends ServiceImpl<CmsSubjectProductRelationMapper, CmsSubjectProductRelation>
    implements CmsSubjectProductRelationService {}
