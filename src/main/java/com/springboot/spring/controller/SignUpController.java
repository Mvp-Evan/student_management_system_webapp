package com.springboot.spring.controller;

import com.springboot.spring.entity.Student;
import com.springboot.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignUpController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("signUp")
    public String signUp(@RequestParam("id") int id,
                         @RequestParam("passwd") String passwd,
                         @RequestParam("name") String name,
                         @RequestParam("subject") String subject){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setPasswd(passwd);
        student.setSubject(subject);
        studentRepository.save(student);
        return "redirect:/index.html";
    }
}
