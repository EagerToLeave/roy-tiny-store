package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsAdminLoginLogService;
import com.tiny.store.entity.UmsAdminLoginLog;
import com.tiny.store.mapper.UmsAdminLoginLogMapper;
import org.springframework.stereotype.Service;

/**
 * 后台用户登录日志表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsAdminLoginLogServiceImpl
    extends ServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog>
    implements UmsAdminLoginLogService {}
