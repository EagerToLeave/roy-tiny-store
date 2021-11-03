package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsHomeAdvertiseService;
import com.tiny.store.entity.SmsHomeAdvertise;
import com.tiny.store.mapper.SmsHomeAdvertiseMapper;
import org.springframework.stereotype.Service;

/**
 * 首页轮播广告表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsHomeAdvertiseServiceImpl
    extends ServiceImpl<SmsHomeAdvertiseMapper, SmsHomeAdvertise>
    implements SmsHomeAdvertiseService {}
