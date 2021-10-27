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
 * 公司收发货地址表
 * </p>
 *
 * @author roy
 * @since 2021-10-24
 */
@Getter
@Setter
@TableName("oms_company_address")
@ApiModel(value = "OmsCompanyAddress对象", description = "公司收发货地址表")
public class OmsCompanyAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("地址名称")
    @TableField("address_name")
    private String addressName;

    @ApiModelProperty("默认发货地址：0->否；1->是")
    @TableField("send_status")
    private Integer sendStatus;

    @ApiModelProperty("是否默认收货地址：0->否；1->是")
    @TableField("receive_status")
    private Integer receiveStatus;

    @ApiModelProperty("收发货人姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("收货人电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("省/直辖市")
    @TableField("province")
    private String province;

    @ApiModelProperty("市")
    @TableField("city")
    private String city;

    @ApiModelProperty("区")
    @TableField("region")
    private String region;

    @ApiModelProperty("详细地址")
    @TableField("detail_address")
    private String detailAddress;


}
