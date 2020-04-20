package com.springboot.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName="myFilter",urlPatterns="/*") // urlPatterns : 过滤访问路径数组 String... str  通配符：* 表示任意路径
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器操作");
        filterChain.doFilter( servletRequest , servletResponse );
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
