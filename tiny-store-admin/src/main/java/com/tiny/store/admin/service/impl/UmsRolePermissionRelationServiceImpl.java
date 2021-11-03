package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsRolePermissionRelationService;
import com.tiny.store.entity.UmsRolePermissionRelation;
import com.tiny.store.mapper.UmsRolePermissionRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 后台用户角色和权限关系表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsRolePermissionRelationServiceImpl
    extends ServiceImpl<UmsRolePermissionRelationMapper, UmsRolePermissionRelation>
    implements UmsRolePermissionRelationService {}
