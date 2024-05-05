package com.ryanspring.springdemo.filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class MyFilter_3 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter 3 running is called");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
