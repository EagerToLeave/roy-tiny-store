package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsOrderService;
import com.tiny.store.entity.OmsOrder;
import com.tiny.store.mapper.OmsOrderMapper;
import org.springframework.stereotype.Service;

/**
 * 订单表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder>
    implements OmsOrderService {}
