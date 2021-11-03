package com.tiny.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户标签表
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("ums_member_tag")
@ApiModel(value = "UmsMemberTag对象", description = "用户标签表")
public class UmsMemberTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("自动打标签完成订单数量")
    @TableField("finish_order_count")
    private Integer finishOrderCount;

    @ApiModelProperty("自动打标签完成订单金额")
    @TableField("finish_order_amount")
    private BigDecimal finishOrderAmount;


}
