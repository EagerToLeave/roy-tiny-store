package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsCommentService;
import com.tiny.store.entity.PmsComment;
import com.tiny.store.mapper.PmsCommentMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentMapper, PmsComment> implements
    PmsCommentService {

}
