package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductService;
import com.tiny.store.entity.PmsProduct;
import com.tiny.store.mapper.PmsProductMapper;
import org.springframework.stereotype.Service;

/**
 * 商品信息 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct>
    implements PmsProductService {}
