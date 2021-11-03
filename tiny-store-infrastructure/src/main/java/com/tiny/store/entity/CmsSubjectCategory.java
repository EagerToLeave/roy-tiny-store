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
 * 专题分类表
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("cms_subject_category")
@ApiModel(value = "CmsSubjectCategory对象", description = "专题分类表")
public class CmsSubjectCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("分类图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("专题数量")
    @TableField("subject_count")
    private Integer subjectCount;

    @TableField("show_status")
    private Integer showStatus;

    @TableField("sort")
    private Integer sort;


}
