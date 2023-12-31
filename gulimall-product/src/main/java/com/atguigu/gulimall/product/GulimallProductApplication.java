package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合MyBatis-Plus
 *   1）、导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *
 *   2）、配置
 *     1、配置驱动:
 *     	1）、导入数据库驱动
 *     	2）、在application.yml中配置数据源信息
 *
 *     2、配置MyBatis-plus:
 *      	1）、使用注解@MapperScan
 *  *     	2）、告诉映射文件的位置
 *
 * 2、https://baomidou.com/pages/6b03c5/#%E6%AD%A5%E9%AA%A4-1-%E9%85%8D%E7%BD%AEcom-baomidou-mybatisplus-core-config-globalconfig-dbconfig
 * 参考官网进行配置
 * 配置全局逻辑删除
 * 注解@TableLogic
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
