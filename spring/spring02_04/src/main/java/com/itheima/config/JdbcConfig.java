package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@PropertySource("jdbc.properties")
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;


    @Bean(name = "dataSource1")
    public DataSource createDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(this.driver);
        ds.setUrl(this.url);
        ds.setUsername(this.username);
        ds.setPassword(this.password);
        return ds;
    }
    @Bean(name = "dataSource2")
    public DataSource createDataSource2(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(this.driver);
        ds.setUrl(this.url);
        ds.setUsername(this.username);
        ds.setPassword(this.password);
        return ds;
    }

    @Bean
    public JdbcTemplate createJdbcTemplate(@Qualifier("dataSource1") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
