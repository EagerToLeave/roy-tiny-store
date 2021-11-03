package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsFeightTemplateService;
import com.tiny.store.entity.PmsFeightTemplate;
import com.tiny.store.mapper.PmsFeightTemplateMapper;
import org.springframework.stereotype.Service;

/**
 * 运费模版 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsFeightTemplateServiceImpl
    extends ServiceImpl<PmsFeightTemplateMapper, PmsFeightTemplate>
    implements PmsFeightTemplateService {}
