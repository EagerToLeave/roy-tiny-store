package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberMemberTagRelationService;
import com.tiny.store.entity.UmsMemberMemberTagRelation;
import com.tiny.store.mapper.UmsMemberMemberTagRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 用户和标签关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberMemberTagRelationServiceImpl
    extends ServiceImpl<UmsMemberMemberTagRelationMapper, UmsMemberMemberTagRelation>
    implements UmsMemberMemberTagRelationService {}
