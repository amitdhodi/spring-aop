package com.example.aop.service;

import com.example.aop.annotation.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class AopService {

    @LogExecutionTime
    public void testExecutionTimeWithSleep() throws InterruptedException {
        Thread.sleep(5000);
    }

    @LogExecutionTime
    public void testExecutionTimeWithoutSleep() {
    }
}
