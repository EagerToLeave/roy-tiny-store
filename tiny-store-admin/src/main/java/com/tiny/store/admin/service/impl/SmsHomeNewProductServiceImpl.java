package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsHomeNewProductService;
import com.tiny.store.entity.SmsHomeNewProduct;
import com.tiny.store.mapper.SmsHomeNewProductMapper;
import org.springframework.stereotype.Service;

/**
 * 新鲜好物表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsHomeNewProductServiceImpl
    extends ServiceImpl<SmsHomeNewProductMapper, SmsHomeNewProduct>
    implements SmsHomeNewProductService {}
