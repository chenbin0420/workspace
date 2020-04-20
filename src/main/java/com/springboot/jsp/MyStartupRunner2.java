package com.springboot.jsp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(value = 1)
public class MyStartupRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println( Arrays.asList( strings ) );
        System.out.println(">>>MyStartupRunner2.run() 服务启动执行，执行加载数据操作 2222222222222<<<");
    }
}
