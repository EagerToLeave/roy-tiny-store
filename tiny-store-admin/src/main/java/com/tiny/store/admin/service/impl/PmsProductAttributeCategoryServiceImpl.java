package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductAttributeCategoryService;
import com.tiny.store.entity.PmsProductAttributeCategory;
import com.tiny.store.mapper.PmsProductAttributeCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * 产品属性分类表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductAttributeCategoryServiceImpl
    extends ServiceImpl<PmsProductAttributeCategoryMapper, PmsProductAttributeCategory>
    implements PmsProductAttributeCategoryService {}
