package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsHomeBrandService;
import com.tiny.store.entity.SmsHomeBrand;
import com.tiny.store.mapper.SmsHomeBrandMapper;
import org.springframework.stereotype.Service;

/**
 * 首页推荐品牌表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsHomeBrandServiceImpl extends ServiceImpl<SmsHomeBrandMapper, SmsHomeBrand>
    implements SmsHomeBrandService {}
