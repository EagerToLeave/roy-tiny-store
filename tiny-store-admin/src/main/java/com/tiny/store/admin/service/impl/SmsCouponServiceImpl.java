package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsCouponService;
import com.tiny.store.entity.SmsCoupon;
import com.tiny.store.mapper.SmsCouponMapper;
import org.springframework.stereotype.Service;

/**
 * 优惠卷表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponMapper, SmsCoupon>
    implements SmsCouponService {}
