package com.tiny.store.common.cache.local;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：图灵学院
 * @date ：Created in 2020/2/17
 * @version: V1.0
 * @slogan: 天下风云出我辈，一入代码岁月催
 * @description: 缓存管理工具，采用LRU淘汰策略
 */
@Slf4j
@Component
public class LocalCache {

  /**
   * 过期时间
   */
  @Value(value = "${local.cache.expiration}")
  private Integer expiration;

  private Cache<String, Object> localCache = null;

  @PostConstruct
  private void init() {
    localCache =
        CacheBuilder.newBuilder()
            // 设置本地缓存容器的初始容量
            .initialCapacity(10)
            // 设置本地缓存的最大容量
            .maximumSize(500)
            // 设置写缓存后多少秒过期
            .expireAfterWrite(expiration, TimeUnit.SECONDS)
            .build();
  }

  public void setLocalCache(String key, Object object) {
    localCache.put(key, object);
  }

  public Object get(String key) {
    return localCache.getIfPresent(key);
  }
}
