package com.example.demo.filter;


import javax.servlet.*;
import java.io.IOException;

public class MyFiler implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFiler 初始化");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFiler doFilter");
        chain.doFilter(request, response);
    }
    @Override
    public void destroy() {
        System.out.println("MyFiler 销毁");
    }
}
