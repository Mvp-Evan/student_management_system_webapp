package com.springboot.spring.controller;

import com.springboot.spring.entity.Student;
import com.springboot.spring.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private StudentMapper studentMapper;

    @PostMapping("login")
    public String login(@RequestParam("id") int id,
                        @RequestParam("passwd") String passwd){
        List<Student> students = studentMapper.studentsList();
        boolean isFound = false;

        for (Student student : students) {
            if (student.getId() == id) {
                if (student.getPasswd().equals(passwd)) {
                    isFound = true;
                    break;
                }
            }
        }

        if(!isFound){
            return "redirect:/index.html";
        }
        else{
            return "forward:/student";
        }
    }
}
