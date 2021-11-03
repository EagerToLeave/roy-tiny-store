package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsSkuStockService;
import com.tiny.store.entity.PmsSkuStock;
import com.tiny.store.mapper.PmsSkuStockMapper;
import org.springframework.stereotype.Service;

/**
 * sku的库存 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsSkuStockServiceImpl extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock>
    implements PmsSkuStockService {}
