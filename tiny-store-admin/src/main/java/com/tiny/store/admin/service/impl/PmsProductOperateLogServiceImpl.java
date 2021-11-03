package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductOperateLogService;
import com.tiny.store.entity.PmsProductOperateLog;
import com.tiny.store.mapper.PmsProductOperateLogMapper;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductOperateLogServiceImpl
    extends ServiceImpl<PmsProductOperateLogMapper, PmsProductOperateLog>
    implements PmsProductOperateLogService {}
