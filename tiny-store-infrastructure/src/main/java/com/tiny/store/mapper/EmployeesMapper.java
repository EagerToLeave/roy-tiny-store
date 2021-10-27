package com.tiny.store.mapper;

import com.tiny.store.entity.Employees;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工记录表 Mapper 接口
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Mapper
public interface EmployeesMapper extends BaseMapper<Employees> {

}
