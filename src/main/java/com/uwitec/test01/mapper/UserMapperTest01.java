package com.uwitec.test01.mapper;

import com.uwitec.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapperTest01 {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES (#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
