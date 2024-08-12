package com.example.design_patterns.factory_method.impl;

import com.example.design_patterns.factory_method.Report;

public class PDFReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating PDF Report");
    }
}