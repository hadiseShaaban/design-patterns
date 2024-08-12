package com.example.design_patterns.proxy.controller;

import com.example.design_patterns.proxy.MyService;
import com.example.design_patterns.proxy.MyServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//این کلاس صرفا جهت اجرای کدهای پراکسی نوشته شده است
@RestController
@RequestMapping("/proxy")
public class ProxyController {
    private final MyService myService;

    @Autowired//constructor injecting
    public ProxyController(MyServiceProxy myServiceProxy) {
        this.myService = myServiceProxy;
    }

    @GetMapping("/execute")
    public String executeOperation() {
        myService.performOperation();
        return "Operation Executed";
    }
}
