package com.xiaohui.mapper;

import com.xiaohui.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    @ResultMap("brandResultMap")
    @Select("select  * from tb_brand")
    List<Brand> selectAll();

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    void deleteByIds(@Param("ids") int[] ids);

    @ResultMap("brandResultMap")
    @Select("select * from tb_brand limit #{begin} , #{size}")
    List<Brand> selectByPage(@Param("begin") int begin,@Param("size") int size);

    @Select("select count(*) from tb_brand")
    int selectTotalCount();


    List<Brand> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("brand") Brand brand);

    int selectTotalCountByCondition(Brand brand);
}
