package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.CmsPrefrenceAreaService;
import com.tiny.store.entity.CmsPrefrenceArea;
import com.tiny.store.mapper.CmsPrefrenceAreaMapper;
import org.springframework.stereotype.Service;

/**
 * 优选专区 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class CmsPrefrenceAreaServiceImpl
    extends ServiceImpl<CmsPrefrenceAreaMapper, CmsPrefrenceArea>
    implements CmsPrefrenceAreaService {}
