package com.example.demo.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Consumer implements CommandLineRunner
{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running command");
    }
}
