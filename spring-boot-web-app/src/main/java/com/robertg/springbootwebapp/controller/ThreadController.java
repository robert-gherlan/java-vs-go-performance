package com.robertg.springbootwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thread")
public class ThreadController {

    private static final Logger LOG = LoggerFactory.getLogger(ThreadController.class);

    @GetMapping("/name")
    public String getThreadName() {
        final var currentThreadName = Thread.currentThread().toString();
        LOG.info("Current thread name is: {}", currentThreadName);
        return currentThreadName;
    }
}