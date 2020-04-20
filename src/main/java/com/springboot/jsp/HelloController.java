package com.springboot.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 测试
 * @author binny
 * @version v.0.1
 */
@Controller
public class HelloController {
    // 从 application.properties 中读取配置，如取不到值，默认值为hello Binny
    @Value("${application.hello:hello Binny}")
    private String hello;

    @RequestMapping("/helloJsp.do")
    public String helloJsp( Map<String,Object> map ){
        System.out.println("HelloController.helloJsp()");
        map.put("hello",hello);
        return "helloJsp";
    }
}
