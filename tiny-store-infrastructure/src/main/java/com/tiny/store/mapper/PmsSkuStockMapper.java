package com.tiny.store.mapper;

import com.tiny.store.entity.PmsSkuStock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * sku的库存 Mapper 接口
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Mapper
public interface PmsSkuStockMapper extends BaseMapper<PmsSkuStock> {

}
