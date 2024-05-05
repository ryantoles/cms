package com.ryanspring.springdemo.config;

import com.ryanspring.springdemo.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
    public FilterRegistrationBean<MyNewFilter> registerBean(){
        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customer/*");

        return registrationBean;
    }
}
