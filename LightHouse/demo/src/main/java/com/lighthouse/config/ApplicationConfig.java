package com.lighthouse.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lighthouse.**.mapper")
public class ApplicationConfig {
}