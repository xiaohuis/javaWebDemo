package com.xiaohui.service;

import com.xiaohui.pojo.Brand;
import com.xiaohui.pojo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {

    List<Brand> selsctAll();

    void add(Brand brand);

    void deleteByIds(int[] ids);

    PageBean<Brand> selectByPage(int currentPage,int pageSize);

    PageBean<Brand> selectByPageAndCondition(int currentPage,int pageSize,Brand brand);
}
