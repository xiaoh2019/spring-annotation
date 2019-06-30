package com.cy.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import entities.Color;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Profile:根据环境的不同，动态使用一系列组件
 *     开发环境，测试环境，生产环境
 *
 *
 * @author xiaoH
 * @create 2019-04-25-16:27
 */
@Configuration
@PropertySource("classpath:/db.properties")
public class ConfigOfProfile {

    @Value("db.user")
    private String user;

    @Profile("default")
    @Bean("testDataSource")
    public DataSource dataSourceTest() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setJdbcUrl("jdbc:mysql:///jpa");
        dataSource.setPassword("20131102");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSourceDev() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setJdbcUrl("jdbc:mysql:///hibernate");
        dataSource.setPassword("20131102");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Profile("dev")
    @Bean
    public Color color(){
        return new Color();
    }


}
