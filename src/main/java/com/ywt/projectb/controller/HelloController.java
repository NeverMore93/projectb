package com.ywt.projectb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/projectB")
    String home() {
        return  "Hello World B!";
    }
}
