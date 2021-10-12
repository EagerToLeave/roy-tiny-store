package com.tiny.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Employees implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "入职时间")
    private Date hireTime;

    private static final long serialVersionUID = 1L;
}