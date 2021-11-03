package com.tiny.store.mapper;

import com.tiny.store.entity.PmsProductFullReduction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 产品满减表(只针对同商品) Mapper 接口
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Mapper
public interface PmsProductFullReductionMapper extends BaseMapper<PmsProductFullReduction> {

}
