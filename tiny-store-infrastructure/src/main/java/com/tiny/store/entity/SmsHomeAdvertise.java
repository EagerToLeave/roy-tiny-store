package com.tiny.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 首页轮播广告表
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Getter
@Setter
@TableName("sms_home_advertise")
@ApiModel(value = "SmsHomeAdvertise对象", description = "首页轮播广告表")
public class SmsHomeAdvertise implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("轮播位置：0->PC首页轮播；1->app首页轮播")
    @TableField("type")
    private Integer type;

    @TableField("pic")
    private String pic;

    @TableField("start_time")
    private LocalDateTime startTime;

    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("上下线状态：0->下线；1->上线")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("点击数")
    @TableField("click_count")
    private Integer clickCount;

    @ApiModelProperty("下单数")
    @TableField("order_count")
    private Integer orderCount;

    @ApiModelProperty("链接地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("备注")
    @TableField("note")
    private String note;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;


}
