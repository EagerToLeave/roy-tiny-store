package com.tiny.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PmsComment implements Serializable {
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    @ApiModelProperty(value = "评价星数：0->5")
    private Integer star;

    @ApiModelProperty(value = "评价的ip")
    private String memberIp;

    private Date createTime;

    @ApiModelProperty(value = "0->显示，1->隐藏")
    private Integer showStatus;

    @ApiModelProperty(value = "购买时的商品属性")
    private String productAttribute;

    private Integer collectCouont;

    private Integer readCount;

    @ApiModelProperty(value = "上传图片地址，以逗号隔开")
    private String pics;

    @ApiModelProperty(value = "评论用户头像")
    private String memberIcon;

    private Integer replayCount;

    @ApiModelProperty(value = "评论内容")
    private String content;

    private static final long serialVersionUID = 1L;
}