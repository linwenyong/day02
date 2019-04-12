package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.itheima")
@Import(JdbcConfig.class)
public class SpringConfiguration {
}
