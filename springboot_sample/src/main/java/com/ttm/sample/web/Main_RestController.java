package com.ttm.sample.web;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttm.sample.web.dbaction.Main_Service;

@RestController
public class Main_RestController {
    @Autowired
    Main_Service service;
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/text")
    public String init_sample(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    	}
    
    @RequestMapping("/db1")
    public String getdbdatasample1(@RequestParam(value="id", defaultValue="0") String id) {
        return service.getObjectbyId(id).toString();
    	}
    
    @RequestMapping("/db2")
    public String getdbdatasample2() {
        return service.getObjects().toString();
    	}
}
