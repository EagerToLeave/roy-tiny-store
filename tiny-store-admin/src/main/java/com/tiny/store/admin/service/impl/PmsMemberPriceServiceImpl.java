package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsMemberPriceService;
import com.tiny.store.entity.PmsMemberPrice;
import com.tiny.store.mapper.PmsMemberPriceMapper;
import org.springframework.stereotype.Service;

/**
 * 商品会员价格表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsMemberPriceServiceImpl extends ServiceImpl<PmsMemberPriceMapper, PmsMemberPrice>
    implements PmsMemberPriceService {}
