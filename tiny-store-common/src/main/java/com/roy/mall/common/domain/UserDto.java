package com.roy.mall.common.domain;

import lombok.Data;

/**
 * 〈用户登录信息〉
 *
 * @author roy
 * @create 2021/10/24
 * @since 1.0.0
 */
@Data
public class UserDto {

    private Long id;

    private String username;

    private String password;

    private Integer status;

}