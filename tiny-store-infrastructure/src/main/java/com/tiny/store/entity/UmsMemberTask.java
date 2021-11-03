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
 * 会员任务表
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("ums_member_task")
@ApiModel(value = "UmsMemberTask对象", description = "会员任务表")
public class UmsMemberTask implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("赠送成长值")
    @TableField("growth")
    private Integer growth;

    @ApiModelProperty("赠送积分")
    @TableField("intergration")
    private Integer intergration;

    @ApiModelProperty("任务类型：0->新手任务；1->日常任务")
    @TableField("type")
    private Integer type;


}
