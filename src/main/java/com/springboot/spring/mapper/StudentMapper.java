package com.springboot.spring.mapper;

import com.springboot.spring.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> studentsList();
}


