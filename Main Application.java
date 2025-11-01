package com.example.bankapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        BankService service = context.getBean(BankService.class);

        service.transferMoney(101, 102, 1000);

        System.out.println("Transaction completed successfully.");
        context.close();
    }
}
