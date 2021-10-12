package com.tiny.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class SmsHomeBrand implements Serializable {
    private Long id;

    @ApiModelProperty(value = "品牌ID[关联pms_brand品牌推荐]")
    private Long brandId;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "推荐状态:1推荐，0取消推荐")
    private Integer recommendStatus;

    @ApiModelProperty(value = "排序序号")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}