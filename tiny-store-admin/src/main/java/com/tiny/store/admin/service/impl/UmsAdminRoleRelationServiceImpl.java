package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsAdminRoleRelationService;
import com.tiny.store.entity.UmsAdminRoleRelation;
import com.tiny.store.mapper.UmsAdminRoleRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 后台用户和角色关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsAdminRoleRelationServiceImpl
    extends ServiceImpl<UmsAdminRoleRelationMapper, UmsAdminRoleRelation>
    implements UmsAdminRoleRelationService {}
