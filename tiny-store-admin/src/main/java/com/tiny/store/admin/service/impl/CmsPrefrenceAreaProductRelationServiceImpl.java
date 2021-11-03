package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsPrefrenceAreaProductRelationService;
import com.tiny.store.entity.CmsPrefrenceAreaProductRelation;
import com.tiny.store.mapper.CmsPrefrenceAreaProductRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 优选专区和产品关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsPrefrenceAreaProductRelationServiceImpl
    extends ServiceImpl<CmsPrefrenceAreaProductRelationMapper, CmsPrefrenceAreaProductRelation>
    implements CmsPrefrenceAreaProductRelationService {}
