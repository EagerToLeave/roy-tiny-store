package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsRoleService;
import com.tiny.store.entity.UmsRole;
import com.tiny.store.mapper.UmsRoleMapper;
import org.springframework.stereotype.Service;

/**
 * 后台用户角色表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper, UmsRole>
    implements UmsRoleService {}
