package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductFullReductionService;
import com.tiny.store.entity.PmsProductFullReduction;
import com.tiny.store.mapper.PmsProductFullReductionMapper;
import org.springframework.stereotype.Service;

/**
 * 产品满减表(只针对同商品) 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductFullReductionServiceImpl
    extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction>
    implements PmsProductFullReductionService {}
