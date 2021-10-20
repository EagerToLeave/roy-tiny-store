package com.roy.mall.common.api;

import com.github.pagehelper.PageInfo;
import java.util.List;
import lombok.Data;
import org.springframework.data.domain.Page;

/**
 * 通用分页数据封装类
 * @author EDZ
 */
@Data
public class CommonPage<T> {

  private Integer pageNum;

  private Integer pageSize;

  private Integer totalPage;

  private Long total;

  private List<T> list;

  /**
   * pageHelper分页数据转换
   * @param list 分页数据
   * @param <T>
   * @return 转换后分页数据
   */
  public static <T> CommonPage<T> restPage(List<T> list){
    CommonPage<T> result = new CommonPage<>();
    PageInfo<T> pageInfo = new PageInfo<>(list);
    result.setTotalPage(pageInfo.getPages());
    result.setPageNum(pageInfo.getPageNum());
    result.setPageSize(pageInfo.getPageSize());
    result.setTotal(pageInfo.getTotal());
    result.setList(pageInfo.getList());
    return result;
  }

  public static <T> CommonPage<T> restPage(Page<T> pageInfo){
    CommonPage<T> result = new CommonPage<>();
    result.setTotalPage(pageInfo.getTotalPages());
    result.setPageNum(pageInfo.getNumber());
    result.setPageSize(pageInfo.getSize());
    result.setTotal(pageInfo.getTotalElements());
    result.setList(pageInfo.getContent());
    return result;
  }

}
