package com.cy.tx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author xiaoH
 * @create 2019-04-25-23:57
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql="insert into user(user_name,password) values(?,?)";
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString().substring(0,5);
        jdbcTemplate.update(sql,s,17);
    }
}
