package com.gitee.freakchicken.dbapi.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(value = "com.gitee.freakchicken.dbapi.basic", excludeFilters = { @ComponentScan.Filter(type = FilterType.REGEX, pattern = { "com.gitee.freakchicken.dbapi.basic.filter.*" }) })
@MapperScan("com.gitee.freakchicken.dbapi.basic.dao")
@EnableCaching
//@EnableDiscoveryClient
public class C_Y3DmXty3 {

    public static void main(String[] p_t66LgEYt) {
        System.setProperty("spring.profiles.active", "manager");
        SpringApplication.run(C_Y3DmXty3.class, p_t66LgEYt);
    }
}
