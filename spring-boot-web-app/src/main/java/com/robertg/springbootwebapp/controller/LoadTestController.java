package com.robertg.springbootwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadTestController {

    @GetMapping
    public String load() throws InterruptedException {
        Thread.sleep(1000);
        return "";
    }
}