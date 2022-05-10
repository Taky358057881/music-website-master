package com.example.yin.controller;

import com.example.yin.service.impl.ConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ConsumerController {
    @Autowired
    private ConsumerServiceImpl consumerService;

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public Object allUser(){
        return consumerService.allUser();
    }
}
