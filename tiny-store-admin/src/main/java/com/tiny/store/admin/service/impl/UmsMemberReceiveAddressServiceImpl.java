package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberReceiveAddressService;
import com.tiny.store.entity.UmsMemberReceiveAddress;
import com.tiny.store.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.stereotype.Service;

/**
 * 会员收货地址表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberReceiveAddressServiceImpl
    extends ServiceImpl<UmsMemberReceiveAddressMapper, UmsMemberReceiveAddress>
    implements UmsMemberReceiveAddressService {}
