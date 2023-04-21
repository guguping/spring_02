package com.icia.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello1")
    public String Hello1(){
        return "hello1";
    }

    @GetMapping("/hello-param1")
    public String Hello2(@RequestParam("name") String name,@RequestParam("age") String age){
        System.out.println("name = " + name + ", age = " + age);
        return "hello2";
    }
    @GetMapping("/hello-param2")
    public String Hollo2_1(@RequestParam("email") String email,@RequestParam("password") int password ){
        System.out.println("email = " + email + ", password = " + password);
        return "index";
    }
    @GetMapping("/form-param1")
    public String formParam1(@RequestParam("p1") String p1,@RequestParam("p2") String p2){
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        return "index";
    }
    /* @GetMapping ("/form-param1") 와 @PostMapping ("/form-param1")는
    *  메인주소는 같지만 전송 방식이 다르기 때문에 다르다고 판단되어 같은 주소로 사용 가능하다 */
    @PostMapping("/form-param1")
    public String formParam2(@RequestParam String p3,@RequestParam String p4) {
        /* 파라미터의 변수 이름과 메소드에서 사용하는 변수의 이름이 같으면 생략 가능하다 */
        System.out.println("p3 = " + p3 + ", p4 = " + p4);
        return "index";
    }

}
