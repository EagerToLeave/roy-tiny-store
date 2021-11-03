package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsOrderReturnApplyService;
import com.tiny.store.entity.OmsOrderReturnApply;
import com.tiny.store.mapper.OmsOrderReturnApplyMapper;
import org.springframework.stereotype.Service;

/**
 * 订单退货申请 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsOrderReturnApplyServiceImpl
    extends ServiceImpl<OmsOrderReturnApplyMapper, OmsOrderReturnApply>
    implements OmsOrderReturnApplyService {}
