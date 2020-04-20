package com.springboot.jsp;

import com.springboot.registration.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * springboot启动类
 */
@SpringBootApplication
@ServletComponentScan // 扫描Servlet注册组件扫描  - 包默认在本包中扫描 ServletComponentScan
public class App {

    @Bean
    public ServletRegistrationBean MyServlet1(){
        return new ServletRegistrationBean(new MyServlet1(),"/myServlet/*");
    }

    public static void main(String[] args) {
        SpringApplication.run( App.class , new String[]{"tom","张三"} );
    }
}
