package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductAttributeValueService;
import com.tiny.store.entity.PmsProductAttributeValue;
import com.tiny.store.mapper.PmsProductAttributeValueMapper;
import org.springframework.stereotype.Service;

/**
 * 存储产品参数信息的表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductAttributeValueServiceImpl
    extends ServiceImpl<PmsProductAttributeValueMapper, PmsProductAttributeValue>
    implements PmsProductAttributeValueService {}
