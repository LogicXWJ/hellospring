package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.attribute.standard.PrinterMessageFromOperator;

@SpringBootApplication
public class HellospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellospringApplication.class, args);

        System.out.println("Hello,springApplication!");

    }


}
