package com.example.design_patterns.builder.controller;

import com.example.design_patterns.builder.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class UserController {

    @GetMapping("/user-builder")
    public void userBuilder(){
        // ایجاد یک User با استفاده از Builder
        User user1 = new User.UserBuilder("John", "Doe")
                .withEmail("john.doe@example.com")
                .withAge(30)
                .build();

        System.out.println(user1);

        // ایجاد یک User دیگر با مقادیر متفاوت
        User user2 = new User.UserBuilder("Jane", "Smith")
                .withPhoneNumber("123-456-7890")
                .build();

        System.out.println(user2);
    }
}
