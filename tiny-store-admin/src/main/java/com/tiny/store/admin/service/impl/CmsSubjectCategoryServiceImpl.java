package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsSubjectCategoryService;
import com.tiny.store.entity.CmsSubjectCategory;
import com.tiny.store.mapper.CmsSubjectCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * 专题分类表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsSubjectCategoryServiceImpl
    extends ServiceImpl<CmsSubjectCategoryMapper, CmsSubjectCategory>
    implements CmsSubjectCategoryService {}
