# spring-aop
A sample maven project to demonstrate the spring aspect oriented programming. 

# Steps to test the application:
1. Clone the repository using git clone:
git clone https://github.com/amitdhodi/spring-aop.git

2. Import the project in IDE as maven project

3. Run the AopServiceTest.java which runs the test case and evaluates the time taken by the service methods to complete. One method has a 5 sec sleep added and other is blank method. Log statement after running the test case would appear as shown below on console:

Time taken to execute: void com.example.aop.service.AopService.testExecutionTimeWithSleep() 5014 ms

Time taken to execute: void com.example.aop.service.AopService.testExecutionTimeWithoutSleep() 0 ms

# Brief Explanation:
1. Spring annotation created with "LogExecutionTime" interface present in package "com.example.aop.annotation"

2. @LogExecutionTime annotation added on top of methods whose execution time need to be calculated

3. Spring aspect created using class "LogTimeAspect" which uses the @Around aspect annotation. This advice surrounds the join point method and acts like an interceptor or filter. We calculate the current time before the service method is executed and then once execution is done we calculate the time taken by the service method and log that on console.
