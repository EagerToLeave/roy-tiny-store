package com.tiny.store.fluent.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * UmsMemberEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@FluentMybatis(
    table = "ums_member",
    schema = "roy-mall"
)
public class UmsMemberEntity extends RichEntity {
  private static final long serialVersionUID = 1L;

  /**
   */
  @TableId("id")
  private Long id;

  /**
   * 生日
   */
  @TableField("birthday")
  private Date birthday;

  /**
   * 所做城市
   */
  @TableField("city")
  private String city;

  /**
   * 注册时间
   */
  @TableField("create_time")
  private Date createTime;

  /**
   * 性别：0->未知；1->男；2->女
   */
  @TableField("gender")
  private Integer gender;

  /**
   * 成长值
   */
  @TableField("growth")
  private Integer growth;

  /**
   * 历史积分数量
   */
  @TableField("history_integration")
  private Integer historyIntegration;

  /**
   * 头像
   */
  @TableField("icon")
  private String icon;

  /**
   * 积分
   */
  @TableField("integration")
  private Integer integration;

  /**
   * 职业
   */
  @TableField("job")
  private String job;

  /**
   * 剩余抽奖次数
   */
  @TableField("luckey_count")
  private Integer luckeyCount;

  /**
   */
  @TableField("member_level_id")
  private Long memberLevelId;

  /**
   * 昵称
   */
  @TableField("nickname")
  private String nickname;

  /**
   * 密码
   */
  @TableField("password")
  private String password;

  /**
   * 个性签名
   */
  @TableField("personalized_signature")
  private String personalizedSignature;

  /**
   * 手机号码
   */
  @TableField("phone")
  private String phone;

  /**
   * 用户来源
   */
  @TableField("source_type")
  private Integer sourceType;

  /**
   * 帐号启用状态:0->禁用；1->启用
   */
  @TableField("status")
  private Integer status;

  /**
   * 用户名
   */
  @TableField("username")
  private String username;

  @Override
  public final Class entityClass() {
    return UmsMemberEntity.class;
  }
}
