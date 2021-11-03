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
 * 商品审核记录
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("pms_product_vertify_record")
@ApiModel(value = "PmsProductVertifyRecord对象", description = "商品审核记录")
public class PmsProductVertifyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("审核人")
    @TableField("vertify_man")
    private String vertifyMan;

    @TableField("status")
    private Integer status;

    @ApiModelProperty("反馈详情")
    @TableField("detail")
    private String detail;


}
