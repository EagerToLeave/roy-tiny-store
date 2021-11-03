package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsAdminPermissionRelationService;
import com.tiny.store.entity.UmsAdminPermissionRelation;
import com.tiny.store.mapper.UmsAdminPermissionRelationMapper;
import org.springframework.stereotype.Service;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsAdminPermissionRelationServiceImpl
    extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation>
    implements UmsAdminPermissionRelationService {}
