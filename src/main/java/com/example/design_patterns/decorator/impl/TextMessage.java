package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Message;

public class TextMessage implements Message {
    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
