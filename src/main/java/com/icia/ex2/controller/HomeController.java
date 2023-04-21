package com.icia.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
