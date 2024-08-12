package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Message;

public class MessageDecorator implements Message {
    protected Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent();
    }
}
