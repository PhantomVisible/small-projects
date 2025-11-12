package com.shop.online_shopping.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AppConfig {
    // No extra beans are strictly required for this default setup
    // Spring Boot will auto-configure DataSource, EntityManagerFactory, and TransactionManager
}
