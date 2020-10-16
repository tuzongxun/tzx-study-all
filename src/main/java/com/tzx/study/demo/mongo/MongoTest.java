package com.tzx.study.demo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongoTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean test() {
        try{
            mongoTemplate.createCollection("user");
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
