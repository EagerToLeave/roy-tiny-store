package com.tiny.store.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Blob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Getter
@Setter
@TableName("oauth_code")
@ApiModel(value = "OauthCode对象", description = "")
public class OauthCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("code")
    private String code;

    @TableField("authentication")
    private Blob authentication;


}
