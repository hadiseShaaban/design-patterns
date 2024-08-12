package com.example.design_patterns;

import com.example.design_patterns.decorator.Message;
import com.example.design_patterns.decorator.impl.EncryptionDecorator;
import com.example.design_patterns.decorator.impl.HtmlMessageDecorator;
import com.example.design_patterns.decorator.impl.TextMessage;
import com.example.design_patterns.factory_method.ReportCreator;
import com.example.design_patterns.factory_method.impl.PDFReportCreator;
import com.example.design_patterns.factory_method.impl.TextReportCreator;
import com.example.design_patterns.singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		// Create PDF Report
		ReportCreator pdfCreator = new PDFReportCreator();
		pdfCreator.generateReport();

		// Create Text Report
		ReportCreator textCreator = new TextReportCreator();
		textCreator.generateReport();

		Singleton instance = Singleton.INSTANCE;
		instance.doSomething();

		// پیام اصلی بدون تزئین
		Message message = new TextMessage("Hello, World!");

		// اضافه کردن HTML به پیام
		Message htmlMessage = new HtmlMessageDecorator(message);
		System.out.println(htmlMessage.getContent()); // <html><body>Hello, World!</body></html>

		// اضافه کردن رمزگذاری به پیام HTML
		Message encryptedHtmlMessage = new EncryptionDecorator(htmlMessage);
		System.out.println(encryptedHtmlMessage.getContent()); // >lmth/<ydob<>!dlroW ,olleH</ydob><lmth<

	}

}