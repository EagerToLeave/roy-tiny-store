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
 * 运费模版
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("pms_feight_template")
@ApiModel(value = "PmsFeightTemplate对象", description = "运费模版")
public class PmsFeightTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("计费类型:0->按重量；1->按件数")
    @TableField("charge_type")
    private Integer chargeType;

    @ApiModelProperty("首重kg")
    @TableField("first_weight")
    private BigDecimal firstWeight;

    @ApiModelProperty("首费（元）")
    @TableField("first_fee")
    private BigDecimal firstFee;

    @TableField("continue_weight")
    private BigDecimal continueWeight;

    @TableField("continme_fee")
    private BigDecimal continmeFee;

    @ApiModelProperty("目的地（省、市）")
    @TableField("dest")
    private String dest;


}
