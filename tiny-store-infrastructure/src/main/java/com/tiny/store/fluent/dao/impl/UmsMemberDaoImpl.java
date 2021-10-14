package com.tiny.store.fluent.dao.impl;

import com.tiny.store.fluent.dao.base.UmsMemberBaseDao;
import com.tiny.store.fluent.dao.intf.UmsMemberDao;
import com.tiny.store.fluent.entity.UmsMemberEntity;
import com.tiny.store.fluent.wrapper.UmsMemberQuery;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * UmsMemberDaoImpl: 数据操作接口实现
 *
 * <p>这只是一个减少手工创建的模板文件 可以任意添加方法和实现, 更改作者和重定义类名
 *
 * <p>@author Powered By Fluent Mybatis
 */
@Repository
public class UmsMemberDaoImpl extends UmsMemberBaseDao implements UmsMemberDao {

  /**
   * 根据用户名查询
   *
   * @param username
   * @return
   */
  @Override
  public Optional<UmsMemberEntity> getMemberInfoByName(String username) {
    UmsMemberEntity umsMemberEntity =
        mapper().findOne(new UmsMemberQuery().where.username().eq(username).end());
    return Optional.ofNullable(umsMemberEntity);
  }
}
