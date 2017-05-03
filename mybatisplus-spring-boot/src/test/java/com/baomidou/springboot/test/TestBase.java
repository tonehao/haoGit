package com.baomidou.springboot.test;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Value;

import com.jayway.restassured.RestAssured;

public class TestBase {

	@Value("${local.server.port}")   //3
    int port;
	
	@Before
    public void doBefore(){
        RestAssured.port = port;//4: 告诉restAssured使用哪个端口来访问
    }
}
