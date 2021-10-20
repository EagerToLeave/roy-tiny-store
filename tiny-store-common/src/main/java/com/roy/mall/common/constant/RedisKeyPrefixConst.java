package com.roy.mall.common.constant;

/**
 * redis key前缀常量
 *
 * @author EDZ
 */
public interface RedisKeyPrefixConst {

  /** 产品详情 */
  String PRODUCT_DETAIL_CACHE = "product:detail:cache";
  /** 秒杀产品库存 */
  String SECKILL_STOCK_CHCHE_PREFIX = "seckill:stock:cache";
  /** 秒杀活动用户已购买标识 */
  String MEMBER_HAS_BROUGHT_PREFIX = "brought:seckill:cache";
  /** 秒杀活动验证码 */
  String SECKILL_VERIFY_CODE_PREFIX = "seckill:verify:code";
  /** 秒杀活动token */
  String SECKILL_TOKEN_PREFIX = "seckill:token";
  /** 秒杀活动异步下单状态 -1 -> 秒杀失败 0 -> 排队中 >0 -> 秒杀成功,对应订单编号 */
  String SECKILL_ASYNC_STATUS_PREFIX = "seckill:async:status";
  /** 当前参与秒杀活动的商品hash-key */
  String FLASH_PROMOTION_PRODUCT_KEY = "flash:promotion:hashtable";
  /** 秒杀活动信息 */
  String ACTIVE_FLASH_PROMOTION_KEY = "flash:promotion:info";
  /** 库存为0时,再一次库存同步,防止存在预减 */
  String STOCK_REFRESHED_MESSAGE_PREFIX = "stock:refreshed:message";
  /** 商品布隆过滤器 */
  String PRODUCT_BLOOM_FILTER = "product:bloom:filter";
}
