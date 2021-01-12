package com.springboot.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/value")
    public String getPort(){
        return port;
    }
}
