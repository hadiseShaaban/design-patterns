package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Message;

public class EncryptionDecorator extends MessageDecorator {

    public EncryptionDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(message.getContent());
    }

    private String encrypt(String content) {
        // پیاده‌سازی ساده رمزگذاری (برعکس کردن رشته)
        return new StringBuilder(content).reverse().toString();
    }
}
