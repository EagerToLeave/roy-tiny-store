package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsSubjectService;
import com.tiny.store.entity.CmsSubject;
import com.tiny.store.mapper.CmsSubjectMapper;
import org.springframework.stereotype.Service;

/**
 * 专题表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsSubjectServiceImpl extends ServiceImpl<CmsSubjectMapper, CmsSubject>
    implements CmsSubjectService {}
