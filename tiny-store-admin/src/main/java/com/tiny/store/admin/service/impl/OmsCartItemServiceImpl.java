package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsCartItemService;
import com.tiny.store.entity.OmsCartItem;
import com.tiny.store.mapper.OmsCartItemMapper;
import org.springframework.stereotype.Service;

/**
 * 购物车表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsCartItemServiceImpl extends ServiceImpl<OmsCartItemMapper, OmsCartItem>
    implements OmsCartItemService {}
