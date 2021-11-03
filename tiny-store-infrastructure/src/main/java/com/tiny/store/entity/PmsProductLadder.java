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
 * 产品阶梯价格表(只针对同商品)
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("pms_product_ladder")
@ApiModel(value = "PmsProductLadder对象", description = "产品阶梯价格表(只针对同商品)")
public class PmsProductLadder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("product_id")
    private Long productId;

    @ApiModelProperty("满足的商品数量")
    @TableField("count")
    private Integer count;

    @ApiModelProperty("折扣")
    @TableField("discount")
    private BigDecimal discount;

    @ApiModelProperty("折后价格")
    @TableField("price")
    private BigDecimal price;


}
