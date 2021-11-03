package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductLadderService;
import com.tiny.store.entity.PmsProductLadder;
import com.tiny.store.mapper.PmsProductLadderMapper;
import org.springframework.stereotype.Service;

/**
 * 产品阶梯价格表(只针对同商品) 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductLadderServiceImpl
    extends ServiceImpl<PmsProductLadderMapper, PmsProductLadder>
    implements PmsProductLadderService {}
