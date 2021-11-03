package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsOrderReturnReasonService;
import com.tiny.store.entity.OmsOrderReturnReason;
import com.tiny.store.mapper.OmsOrderReturnReasonMapper;
import org.springframework.stereotype.Service;

/**
 * 退货原因表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsOrderReturnReasonServiceImpl
    extends ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason>
    implements OmsOrderReturnReasonService {}
