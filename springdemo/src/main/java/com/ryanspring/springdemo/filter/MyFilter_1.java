package com.ryanspring.springdemo.filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.LogRecord;

@Component
@Order(2)
public class MyFilter_1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter 1 running is called");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
