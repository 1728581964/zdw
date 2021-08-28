package com.example.student_mis.config;

import com.example.student_mis.utils.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * Create by zhengdawei on 2021/6/4 20:16
 */


/**
 * Description 解决vue+spring boot跨域问题
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS")
                .maxAge(3600 * 24);
    }
    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加自定义拦截器和拦截路径，此处对所有请求进行拦截，除了登录界面和登录接口
        registry.addInterceptor(appInterceptor())
                .addPathPatterns("/api/sms/**")//添加拦截路径,拦截所有
                .excludePathPatterns("/login"); // 排除的拦截路径
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public HandlerInterceptor appInterceptor(){
        return new AuthenticationInterceptor();
    }
}

