package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author wrmeng
 * @create 2023-11-02 17:59
 *
 * 解决开发期间的跨域问题filter
 *
 **/

@Configuration
public class GulimallCorsConfiguration {

    // 使用springboot 提供 CorsWebFilter

    @Bean
    public CorsWebFilter corsWebFilter(){

        // ctrl+H :查看类的继承关系
        // 主要通过配置这个
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //  配置跨域
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(true);// 允许携带请求头


        source.registerCorsConfiguration("/**",corsConfiguration);


        CorsWebFilter corsWebFilter = new CorsWebFilter(source);
        return corsWebFilter;
    }


}
