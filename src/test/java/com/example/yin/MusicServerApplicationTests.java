package com.example.yin;

import com.example.yin.domain.Consumer;
import com.example.yin.service.ConsumerService;
import com.example.yin.service.impl.ConsumerServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
class MusicServerApplicationTests {

    @Autowired
    private ConsumerServiceImpl consumerService;

//    @Test
//    void contextLoads() {
//        Consumer consumer = new Consumer();
//        consumer.setUsername("Taky");
//        consumer.setPassword("123");
//        consumer.setSex(new Byte("0"));
//        consumer.setPhoneNum("19966796664");
//        consumer.setEmail("358057881@qq.com");
//        consumer.setBirth(new Date());
//        consumer.setIntroduction("");
//        consumer.setLocation("");
//        consumer.setAvator("/img/avatorImages/user.jpg");
//        consumer.setCreateTime(new Date());
//        consumer.setUpdateTime(new Date());
//        consumerService.addUser(consumer);
//    }

//    @Test
//    public void consumerTest2(){
//        System.out.println(consumerService.allUser());
//    }

}
