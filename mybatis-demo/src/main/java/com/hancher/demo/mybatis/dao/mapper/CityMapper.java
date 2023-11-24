package com.hancher.demo.mybatis.dao.mapper;

import com.hancher.demo.mybatis.dao.entity.City;
import org.apache.ibatis.annotations.*;

/**
 * 
 * @author hancher
 * @date 2021/11/24 12:53
 */
@Mapper
public interface CityMapper {
    @Insert("INSERT INTO city (id,name, state, country,extra_json,extra_json2) VALUES(#{id},#{name}, #{state}," +
            " #{country},#{extraJson,typeHandler=com.hancher.demo.mybatis.comfig.JsonObjectTyperHandler}, #{extraJson2})")
//            " #{country},#{extraJson})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(City city);

//    @Select("SELECT * FROM city WHERE id = #{id}")
    City findById(long id);

    int deleteById(long id);

    int updateById(long id, @Param("name") String name);
}
