package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsTopicCommentService;
import com.tiny.store.entity.CmsTopicComment;
import com.tiny.store.mapper.CmsTopicCommentMapper;
import org.springframework.stereotype.Service;

/**
 * 专题评论表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsTopicCommentServiceImpl extends ServiceImpl<CmsTopicCommentMapper, CmsTopicComment>
    implements CmsTopicCommentService {}
