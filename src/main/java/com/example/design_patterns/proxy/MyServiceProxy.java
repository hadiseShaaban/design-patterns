package com.example.design_patterns.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//این کلاس یک پروکسی برای کلاس MyServiceImpl هستش که بتونه قبل و بعد از کارای اون لاگ بزنه
// این کارارو با aop هم میشه انجام داد
@Component
public class MyServiceProxy implements MyService {

    private final MyServiceImpl myService;

    public MyServiceProxy(MyServiceImpl myService) {
        this.myService = myService;
    }

    @Override
    public void performOperation() {
        System.out.println("Logging: Before performing operation");
        myService.performOperation();
        System.out.println("Logging: After performing operation");
    }
}
