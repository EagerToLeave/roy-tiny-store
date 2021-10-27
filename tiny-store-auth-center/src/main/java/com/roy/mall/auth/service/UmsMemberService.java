package com.roy.mall.auth.service;

import com.roy.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈会员登录信息远程调用服务〉
 *
 * @author roy
 * @create 2021/10/24
 * @since 1.0.0
 */
@FeignClient("tiny-store-member")
public interface UmsMemberService {

    /**
     * 根据用户名加载会员信息
     * @param username 会员名称
     * @return 会员信息
     */
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(String username);

}