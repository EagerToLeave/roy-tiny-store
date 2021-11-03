package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsCouponHistoryService;
import com.tiny.store.entity.SmsCouponHistory;
import com.tiny.store.mapper.SmsCouponHistoryMapper;
import org.springframework.stereotype.Service;

/**
 * 优惠券使用、领取历史表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsCouponHistoryServiceImpl
    extends ServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory>
    implements SmsCouponHistoryService {}
