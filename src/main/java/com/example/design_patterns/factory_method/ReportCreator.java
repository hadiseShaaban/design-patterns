package com.example.design_patterns.factory_method;

public abstract class ReportCreator {
    // Factory Method
    public abstract Report createReport();

    // Method that uses the factory method
    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}
