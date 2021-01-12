package com.springboot.spring.controller;

import com.springboot.spring.entity.Student;
import com.springboot.spring.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShowInfoController {

    @Autowired
    private StudentMapper studentMapper;

    private String name, subject;

    @PostMapping("student")
    public String ShowInfo(@RequestParam("id") int id, Model model){
        List<Student> students = studentMapper.studentsList();

        for(Student student : students){
            if (student.getId() == id){
                name = student.getName();
                subject = student.getSubject();
                break;
            }
        }

        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("subject", subject);
        return "student";
    }
}
