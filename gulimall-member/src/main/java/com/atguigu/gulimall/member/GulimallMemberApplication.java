package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要开启远程调用的步骤
 *   1）引入openfeign依赖
 *   2）接口+注解：编写一个接口，告诉SpringCLoud 这个接口需要远程调用服务
 *       声明接口的每个方法都是调用哪一个远程服务的哪一个请求
 *   3）开启远程调用功能：@EnableFeignClients // 启用openfeign 组件
 */
@SpringBootApplication
@EnableDiscoveryClient // 开服务的注册与发现功能
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign") // 启用openfeign 组件
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
