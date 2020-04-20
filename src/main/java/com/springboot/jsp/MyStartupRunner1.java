package com.springboot.jsp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class MyStartupRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>MyStartupRunner1.run() 服务启动执行，执行加载数据操作 1111111111<<<");
    }
}
