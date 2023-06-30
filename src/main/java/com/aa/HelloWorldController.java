package com.aa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/test")
    public void test(){
        System.out.print("测试");
        System.out.print("测试123");
    }

    public String returnStr(){
        final String testStr = "hello world";
        return testStr;
    }
}
