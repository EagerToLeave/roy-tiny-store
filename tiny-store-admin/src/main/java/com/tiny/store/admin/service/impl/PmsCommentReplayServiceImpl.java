package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsCommentReplayService;
import com.tiny.store.entity.PmsCommentReplay;
import com.tiny.store.mapper.PmsCommentReplayMapper;
import org.springframework.stereotype.Service;

/**
 * 产品评价回复表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsCommentReplayServiceImpl
    extends ServiceImpl<PmsCommentReplayMapper, PmsCommentReplay>
    implements PmsCommentReplayService {}
