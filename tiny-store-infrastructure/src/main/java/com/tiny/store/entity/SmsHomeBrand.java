package com.tiny.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 首页推荐品牌表
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Getter
@Setter
@TableName("sms_home_brand")
@ApiModel(value = "SmsHomeBrand对象", description = "首页推荐品牌表")
public class SmsHomeBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("品牌ID[关联pms_brand品牌推荐]")
    @TableField("brand_id")
    private Long brandId;

    @ApiModelProperty("品牌名称")
    @TableField("brand_name")
    private String brandName;

    @ApiModelProperty("推荐状态:1推荐，0取消推荐")
    @TableField("recommend_status")
    private Integer recommendStatus;

    @ApiModelProperty("排序序号")
    @TableField("sort")
    private Integer sort;


}
