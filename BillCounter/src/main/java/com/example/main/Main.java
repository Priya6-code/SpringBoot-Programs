package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.BillCollector;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");

        BillCollector bc = context.getBean("billCollector", BillCollector.class);
        bc.collectPayment(15000.00);
    }
}
