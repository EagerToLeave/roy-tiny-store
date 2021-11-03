package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberStatisticsInfoService;
import com.tiny.store.entity.UmsMemberStatisticsInfo;
import com.tiny.store.mapper.UmsMemberStatisticsInfoMapper;
import org.springframework.stereotype.Service;

/**
 * 会员统计信息 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberStatisticsInfoServiceImpl
    extends ServiceImpl<UmsMemberStatisticsInfoMapper, UmsMemberStatisticsInfo>
    implements UmsMemberStatisticsInfoService {}
