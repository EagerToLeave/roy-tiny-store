package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsOrderItemService;
import com.tiny.store.entity.OmsOrderItem;
import com.tiny.store.mapper.OmsOrderItemMapper;
import org.springframework.stereotype.Service;

/**
 * 订单中所包含的商品 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem>
    implements OmsOrderItemService {}
