package com.tiny.store.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TinyStoreAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(TinyStoreAdminApplication.class, args);
  }
}
