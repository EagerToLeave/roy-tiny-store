package com.tiny.store.fluent.dao.intf;

import cn.org.atool.fluent.mybatis.base.IBaseDao;
import com.tiny.store.fluent.entity.UmsMemberEntity;
import java.util.Optional;

/**
 * UmsMemberDao: 数据操作接口
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
public interface UmsMemberDao extends IBaseDao<UmsMemberEntity> {

  Optional<UmsMemberEntity> getMemberInfoByName(String username);
}
