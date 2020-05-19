package com.travel.scenic.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Description:
* @Author: wzp
* @Date: 2020/5/19
*/

@Configuration
@MapperScan("com.travel.scenic.mapper")
public class MyBatisPlusConfig {

    @Bean
    public PaginationInterceptor page() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}