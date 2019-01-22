package com.epam.springbootjspexample.config;

import com.epam.springbootjspexample.interceptor.AuthInterceptor;
import com.epam.springbootjspexample.interceptor.UserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
public class WebConfig  {

    @Bean
    public AuthInterceptor authInterceptor() {
        return new AuthInterceptor();
    }
    @Bean
    public UserInterceptor userInterceptor() {
        return new UserInterceptor();
    }
//    @Bean
//    public AdminInterceptor adminInterceptor() { return new AdminInterceptor(); }

//    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/productCategory");
        registry.addInterceptor(userInterceptor()).addPathPatterns("/productCategory");
//        registry.addInterceptor(adminInterceptor()).addPathPatterns("/productCategoryAdmin");
    }
}
