package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.UmsMemberLevelService;
import com.tiny.store.entity.UmsMemberLevel;
import com.tiny.store.mapper.UmsMemberLevelMapper;
import org.springframework.stereotype.Service;

/**
 * 会员等级表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelMapper, UmsMemberLevel>
    implements UmsMemberLevelService {}
