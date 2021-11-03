package com.tiny.store.admin.config;

import com.tiny.store.common.config.BaseSwaggerConfig;
import com.tiny.store.common.properties.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 自定义Swagger配置
 * @author EDZ
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

  @Override
  public SwaggerProperties swaggerProperties() {
    return SwaggerProperties.builder()
        .apiBasePackage(" com.tiny.store.admin.controller")
        .title("tiny-store 后台管理")
        .description("tiny-store 后台接口文档")
        .contactName("roy")
        .version("1.0")
        .enableSecurity(true)
        .build();
  }
}
