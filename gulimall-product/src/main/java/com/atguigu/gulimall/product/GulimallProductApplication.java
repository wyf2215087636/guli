package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用MapperScan 进行扫描
 *
 * 使用mybatis-plus  使用逻辑删除 配置全局的逻辑删除规则
 *   global-config:
 *     db-config:
 *       id-type: auto
 *       logic-delete-value: 1
 *       logic-not-delete-value: 0
 *  如果在 3.1.1 版本以下  需要配置逻辑删除的组件
 *  3） 需要在实体类加上逻辑删除注解
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
