package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用nacos作为配置中心功能
 * 1）、引入依赖
 *
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *
 * 2）、创建一个bootstrap.properties(系统级配置文件，优先级高于application.properties)
 *
 * 		spring.application.name=gulimall-coupon
 * 		#nacos 配置中心的注解
 * 		spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3）、需要给配置中心默认添加一个叫做数据集（Data Id）gulimall-coupon.properties。 参考官网的命名方式
 * 4）、添加配置在nacos中的指定配置文件
 * 5）、动态获取配置 ，使用注解
 *     @RefreshScope：动态刷新配置
 *     @Value:获取配置的值
 *
 * 2、细节
 *  1）、命名空间：配置隔离
 *              默认public(保留空间)：默认新增的所有配置都在public空间
 *              1、开发、测试、生产：利用命名空间来做环境隔离。
 *              注意：在bootstrap.properties，配置上需要使用哪个命名空间需要
 *              spring.cloud.nacos.config.namespace=8717e754-65dd-402f-b31d-4f49e7f0d6f8
 *              2、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *
 * 2）、配置集:所有配置的集合
 * 3）、配置集ID：类似文件名
 *          Data ID:
 * 4）、配置分组:
 *         默认所有的配置集都属于：DEFAULT_GROUP
 *         1111，618，1212
 *
 *
 * 项目中的使用：每个微服务创建自己的命名空间，使用配置分组区分环境，dev,test,prod
 *
 *
 * 3、同时加载多个配置集
 *   1）、微服务任何配置信息 ，任何配置文件都可以放在配置中心中
 *   2）、只需要在bootstrap.properties中声明加载配置中心的哪些配置文件即可
 *   3）、使用@Valve，@ConfigurationProperties。。。 等获取配置属性
 *   配置中心有的优先从配置中心获取
 *
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启组件服务注册与发现功能
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
