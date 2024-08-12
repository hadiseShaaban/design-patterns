package com.example.design_patterns.factory_method.impl;

import com.example.design_patterns.factory_method.Report;
import com.example.design_patterns.factory_method.ReportCreator;

public class TextReportCreator extends ReportCreator {
    @Override
    public Report createReport() {
        return new PDFReport();
    }
}
