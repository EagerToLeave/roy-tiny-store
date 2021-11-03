package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductAttributeService;
import com.tiny.store.entity.PmsProductAttribute;
import com.tiny.store.mapper.PmsProductAttributeMapper;
import org.springframework.stereotype.Service;

/**
 * 商品属性参数表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductAttributeServiceImpl
    extends ServiceImpl<PmsProductAttributeMapper, PmsProductAttribute>
    implements PmsProductAttributeService {}
