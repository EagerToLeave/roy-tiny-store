package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.PmsBrandService;
import com.tiny.store.entity.PmsBrand;
import com.tiny.store.mapper.PmsBrandMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements
    PmsBrandService {

}
