package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsSubjectCommentService;
import com.tiny.store.entity.CmsSubjectComment;
import com.tiny.store.mapper.CmsSubjectCommentMapper;
import org.springframework.stereotype.Service;

/**
 * 专题评论表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsSubjectCommentServiceImpl
    extends ServiceImpl<CmsSubjectCommentMapper, CmsSubjectComment>
    implements CmsSubjectCommentService {}
