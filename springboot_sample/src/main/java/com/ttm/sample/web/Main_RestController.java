package com.ttm.sample.web;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
    
//    @RequestMapping("/cesium")
//    public String cesium_map(Model model) {
//        return "cesium_map";
//    	}
    /*로그인은 어떻게 돌아 가려나....
     * 기존 샘플 내용으로 보면 로그인 페이지로 들어 왔을때(?) 서버에서는 세션에 대해서 rsa 키 생성 후 공개키를 해당 페이지로 전달해 준다.
     * 이용자가 로그인 페이지에서 입력한 내용을 공개키를 이용해 암호화 해서 서버에게 전달한다.
     * 서버는 해당 세션의 개인키를 이용해서 수신한 내용을 복호화 한후 처리한다.
     * 이런 식으로 돌아가고 있었음.*/
}
