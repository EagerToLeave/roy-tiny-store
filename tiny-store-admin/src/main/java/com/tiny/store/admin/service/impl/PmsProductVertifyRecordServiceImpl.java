package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsProductVertifyRecordService;
import com.tiny.store.entity.PmsProductVertifyRecord;
import com.tiny.store.mapper.PmsProductVertifyRecordMapper;
import org.springframework.stereotype.Service;

/**
 * 商品审核记录 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsProductVertifyRecordServiceImpl
    extends ServiceImpl<PmsProductVertifyRecordMapper, PmsProductVertifyRecord>
    implements PmsProductVertifyRecordService {}
