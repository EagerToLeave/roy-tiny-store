package com.tiny.store.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiny.store.admin.service.EmployeesService;
import com.tiny.store.entity.Employees;
import com.tiny.store.mapper.EmployeesMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工记录表 服务实现类
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements
    EmployeesService {

}
