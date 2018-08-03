package com.example.aop.service;

import com.example.aop.AopApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = {AopApplication.class})
public class AopServiceTest {

    @Autowired
    private AopService aopService;

    @Test
    public void testLogExecutionTime() throws InterruptedException {
        aopService.testExecutionTimeWithSleep();
        aopService.testExecutionTimeWithoutSleep();
    }
}
