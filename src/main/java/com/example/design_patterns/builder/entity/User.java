package com.example.design_patterns.builder.entity;

import lombok.Data;

@Data
public class User {
    private final String firstName;  // ضروری
    private final String lastName;   // ضروری
    private final String email;      // اختیاری
    private final int age;           // اختیاری
    private final String phoneNumber;// اختیاری

    // سازنده خصوصی که فقط توسط Builder فراخوانی می‌شود
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }

    // کلاس Builder داخلی
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String email;
        private int age;
        private String phoneNumber;

        // سازنده Builder با فیلدهای ضروری
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // متدهای تنظیم (Setter) برای فیلدهای اختیاری
        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // متد build برای ایجاد نمونه نهایی User
        public User build() {
            return new User(this);
        }
    }
}
