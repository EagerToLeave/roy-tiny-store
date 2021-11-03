package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductCategoryService;
import com.tiny.store.entity.PmsProductCategory;
import com.tiny.store.mapper.PmsProductCategoryMapper;
import org.springframework.stereotype.Service;

/**
 * 产品分类 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductCategoryServiceImpl
    extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory>
    implements PmsProductCategoryService {}
