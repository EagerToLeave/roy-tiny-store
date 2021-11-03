package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsHelpCategoryService;
import com.tiny.store.entity.CmsHelpCategory;
import com.tiny.store.mapper.CmsHelpCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * 帮助分类表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsHelpCategoryServiceImpl extends ServiceImpl<CmsHelpCategoryMapper, CmsHelpCategory>
    implements CmsHelpCategoryService {}
