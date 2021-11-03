package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsPermissionService;
import com.tiny.store.entity.UmsPermission;
import com.tiny.store.mapper.UmsPermissionMapper;
import org.springframework.stereotype.Service;

/**
 * 后台用户权限表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper, UmsPermission>
    implements UmsPermissionService {}
