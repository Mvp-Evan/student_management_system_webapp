package com.springboot.spring.mapper;

import com.springboot.spring.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {
    @Select("select * from person")
    public List<Person> personList();
}
