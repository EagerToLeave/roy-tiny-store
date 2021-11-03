package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsTopicCategoryService;
import com.tiny.store.entity.CmsTopicCategory;
import com.tiny.store.mapper.CmsTopicCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * 话题分类表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsTopicCategoryServiceImpl
    extends ServiceImpl<CmsTopicCategoryMapper, CmsTopicCategory>
    implements CmsTopicCategoryService {}
