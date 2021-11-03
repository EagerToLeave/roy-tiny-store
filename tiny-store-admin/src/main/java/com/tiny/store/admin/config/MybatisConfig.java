package com.tiny.store.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * mybatis配置
 * @author EDZ
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.tiny.store.mapper"})
public class MybatisConfig {

}
