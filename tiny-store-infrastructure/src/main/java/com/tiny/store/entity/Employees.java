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
 * 员工记录表
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("employees")
@ApiModel(value = "Employees对象", description = "员工记录表")
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("职位")
    @TableField("position")
    private String position;

    @ApiModelProperty("入职时间")
    @TableField("hire_time")
    private LocalDateTime hireTime;


}
