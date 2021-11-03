package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberService;
import com.tiny.store.entity.UmsMember;
import com.tiny.store.mapper.UmsMemberMapper;
import org.springframework.stereotype.Service;

/**
 * 会员表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember>
    implements UmsMemberService {}
