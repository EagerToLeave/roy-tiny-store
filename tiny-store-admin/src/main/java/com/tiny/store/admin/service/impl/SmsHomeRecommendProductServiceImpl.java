package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsHomeRecommendProductService;
import com.tiny.store.entity.SmsHomeRecommendProduct;
import com.tiny.store.mapper.SmsHomeRecommendProductMapper;
import org.springframework.stereotype.Service;

/**
 * 人气推荐商品表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsHomeRecommendProductServiceImpl
    extends ServiceImpl<SmsHomeRecommendProductMapper, SmsHomeRecommendProduct>
    implements SmsHomeRecommendProductService {}
