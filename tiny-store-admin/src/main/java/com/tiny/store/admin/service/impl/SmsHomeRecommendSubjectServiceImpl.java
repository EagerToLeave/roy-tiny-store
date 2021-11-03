package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.SmsHomeRecommendSubjectService;
import com.tiny.store.entity.SmsHomeRecommendSubject;
import com.tiny.store.mapper.SmsHomeRecommendSubjectMapper;
import org.springframework.stereotype.Service;

/**
 * 首页推荐专题表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class SmsHomeRecommendSubjectServiceImpl
    extends ServiceImpl<SmsHomeRecommendSubjectMapper, SmsHomeRecommendSubject>
    implements SmsHomeRecommendSubjectService {}
