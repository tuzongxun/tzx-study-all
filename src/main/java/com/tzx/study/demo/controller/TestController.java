package com.tzx.study.demo.controller;

import com.tzx.study.demo.mongo.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @Autowired
    private MongoTest mongoTest;

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/create-mongo")
    public boolean createMongoCollectionTest(){
        return mongoTest.test();
    }
}
