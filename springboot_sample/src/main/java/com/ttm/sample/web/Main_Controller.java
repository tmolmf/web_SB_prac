package com.ttm.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_Controller {
    @RequestMapping("/cesium")
    public String cesium_map(Model model) {
        return "cesium_map";
    	}
    /*로그인은 어떻게 돌아 가려나....
     * 기존 샘플 내용으로 보면 로그인 페이지로 들어 왔을때(?) 서버에서는 세션에 대해서 rsa 키 생성 후 공개키를 해당 페이지로 전달해 준다.
     * 이용자가 로그인 페이지에서 입력한 내용을 공개키를 이용해 암호화 해서 서버에게 전달한다.
     * 서버는 해당 세션의 개인키를 이용해서 수신한 내용을 복호화 한후 처리한다.
     * 이런 식으로 돌아가고 있었음.*/
}
