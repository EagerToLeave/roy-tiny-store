package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.OmsOrderOperateHistoryService;
import com.tiny.store.entity.OmsOrderOperateHistory;
import com.tiny.store.mapper.OmsOrderOperateHistoryMapper;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class OmsOrderOperateHistoryServiceImpl
    extends ServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistory>
    implements OmsOrderOperateHistoryService {}
