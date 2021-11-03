package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsMemberReportService;
import com.tiny.store.entity.CmsMemberReport;
import com.tiny.store.mapper.CmsMemberReportMapper;
import org.springframework.stereotype.Service;

/**
 * 用户举报表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsMemberReportServiceImpl extends ServiceImpl<CmsMemberReportMapper, CmsMemberReport>
    implements CmsMemberReportService {}
