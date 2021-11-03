package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsAlbumPicService;
import com.tiny.store.entity.PmsAlbumPic;
import com.tiny.store.mapper.PmsAlbumPicMapper;
import org.springframework.stereotype.Service;

/**
 * 画册图片表 服务实现类
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsAlbumPicServiceImpl extends ServiceImpl<PmsAlbumPicMapper, PmsAlbumPic>
    implements PmsAlbumPicService {}
