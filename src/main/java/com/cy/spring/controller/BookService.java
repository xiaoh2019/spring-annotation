package com.cy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoH
 * @create 2019-04-24-16:34
 */
@Service
public class BookService {

    @Autowired
    //@Resource(name = "bookDao")
    private BookDao bookDao;

    public void save(){
        System.out.println(bookDao);
    }
}
