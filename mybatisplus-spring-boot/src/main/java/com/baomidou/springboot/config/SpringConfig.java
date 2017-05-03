package com.baomidou.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan(basePackages={"com.baomidou.springboot.service","com.baomidou.springboot.controller"})
@Import(value={MybatisPlusConfig.class})
public class SpringConfig {

}
