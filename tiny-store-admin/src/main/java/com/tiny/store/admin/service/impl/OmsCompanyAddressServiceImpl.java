package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsCompanyAddressService;
import com.tiny.store.entity.OmsCompanyAddress;
import com.tiny.store.mapper.OmsCompanyAddressMapper;
import org.springframework.stereotype.Service;

/**
 * 公司收发货地址表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsCompanyAddressServiceImpl
    extends ServiceImpl<OmsCompanyAddressMapper, OmsCompanyAddress>
    implements OmsCompanyAddressService {}
