package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberTaskService;
import com.tiny.store.entity.UmsMemberTask;
import com.tiny.store.mapper.UmsMemberTaskMapper;
import org.springframework.stereotype.Service;

/**
 * 会员任务表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberTaskServiceImpl extends ServiceImpl<UmsMemberTaskMapper, UmsMemberTask>
    implements UmsMemberTaskService {}
