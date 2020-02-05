package com.springbootlearning.springbootapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SerialisationApplicationTests {
    @Autowired
    com.springbootlearning.springbootapplication.bean.staff staff;
    @Test
    void contextLoads() {
        System.out.println(staff);
    }

}
