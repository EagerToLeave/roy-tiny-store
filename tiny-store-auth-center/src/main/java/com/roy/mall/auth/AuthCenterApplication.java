package com.roy.mall.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author roy
 */
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan({"com.tiny.store.mapper"})
@SpringBootApplication
public class AuthCenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(AuthCenterApplication.class, args);
  }

}
