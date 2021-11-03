package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberLoginLogService;
import com.tiny.store.entity.UmsMemberLoginLog;
import com.tiny.store.mapper.UmsMemberLoginLogMapper;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberLoginLogServiceImpl
    extends ServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog>
    implements UmsMemberLoginLogService {}
