package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Message;

public class HtmlMessageDecorator extends MessageDecorator {

    public HtmlMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "<html><body>" + message.getContent() + "</body></html>";
    }
}
