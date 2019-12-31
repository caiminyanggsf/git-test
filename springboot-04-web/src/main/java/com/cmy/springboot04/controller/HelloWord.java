package com.cmy.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloWord {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "hello word";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map)
    {
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
