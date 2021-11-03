package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsHelpService;
import com.tiny.store.entity.CmsHelp;
import com.tiny.store.mapper.CmsHelpMapper;
import org.springframework.stereotype.Service;

/**
 * 帮助表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsHelpServiceImpl extends ServiceImpl<CmsHelpMapper, CmsHelp>
    implements CmsHelpService {}
