package com.tiny.store.mapper;

import com.tiny.store.entity.UmsAdminPermissionRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) Mapper 接口
 * </p>
 *
 * @author roy
 * @since 2021-11-01
 */
@Mapper
public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {

}
