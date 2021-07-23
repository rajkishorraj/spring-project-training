package com.mycode.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycode.*"})
@PropertySource(value = {"classpath:sport.properties"})
public class SpringConfig {

    //we can define bean here as well without using component scan
}
