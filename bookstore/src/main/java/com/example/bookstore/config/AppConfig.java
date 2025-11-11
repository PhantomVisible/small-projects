package com.example.bookstore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // Marks this class as a Spring configuration
@ComponentScan(basePackages = "com.example.bookstore") // Scans for @Component, @Service, @Repository
public class AppConfig {
    // No extra code needed for this simple setup
}
