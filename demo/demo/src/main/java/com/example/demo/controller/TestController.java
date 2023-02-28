package com.example.demo.controller;

import com.example.demo.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/v1/message")
    public  Message getMessage()
    {
        Message message = new Message("Hello this is my 1st RestApi");
        return message;
    }
}
