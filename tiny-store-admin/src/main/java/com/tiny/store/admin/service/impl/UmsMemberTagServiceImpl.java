package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberTagService;
import com.tiny.store.entity.UmsMemberTag;
import com.tiny.store.mapper.UmsMemberTagMapper;
import org.springframework.stereotype.Service;

/**
 * 用户标签表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberTagServiceImpl extends ServiceImpl<UmsMemberTagMapper, UmsMemberTag>
    implements UmsMemberTagService {}
