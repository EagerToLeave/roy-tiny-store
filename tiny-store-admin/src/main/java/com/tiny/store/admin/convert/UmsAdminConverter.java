package com.tiny.store.admin.convert;

import com.tiny.store.admin.dto.UmsAdminParam;
import com.tiny.store.entity.UmsAdmin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * UmsAdmin转换
 * @author EDZ
 */
@Mapper
public interface UmsAdminConverter {

    UmsAdminConverter INSTANCE = Mappers.getMapper(UmsAdminConverter.class);

  /**
   * 用户登录/注册请求参数转为后台用户实体
   * @param param 用户登录/注册参数
   * @return 用户实体类
   */
  UmsAdmin convertToAdmin(UmsAdminParam param);


}
