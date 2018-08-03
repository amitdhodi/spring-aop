package com.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogTimeAspect {

    @Around("@annotation(com.example.aop.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint jointPoint) throws Throwable {
        Long startTime = System.currentTimeMillis();
        Object proceed = jointPoint.proceed();
        Long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken to execute: " + jointPoint.getSignature() + " " + timeTaken + " ms");
        return proceed;
    }
}