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
@TableName("oauth_refresh_token")
@ApiModel(value = "OauthRefreshToken对象", description = "")
public class OauthRefreshToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("token_id")
    private String tokenId;

    @TableField("token")
    private Blob token;

    @TableField("authentication")
    private Blob authentication;


}
