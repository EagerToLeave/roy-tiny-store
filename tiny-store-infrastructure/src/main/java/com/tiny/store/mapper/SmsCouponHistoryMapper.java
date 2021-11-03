package com.tiny.store.mapper;

import com.tiny.store.entity.SmsCouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 优惠券使用、领取历史表 Mapper 接口
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Mapper
public interface SmsCouponHistoryMapper extends BaseMapper<SmsCouponHistory> {

}
