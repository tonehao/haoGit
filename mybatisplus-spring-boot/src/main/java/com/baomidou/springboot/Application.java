package com.baomidou.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * mybatis-plus Spring Boot 测试 Demo<br>
 * 文档：http://mp.baomidou.com<br>
 */
@SpringBootApplication
public class Application {

	protected final static Logger logger = LoggerFactory.getLogger(Application.class);

	/**
	 * <p>
	 * 测试 RUN<br>
	 * 查看 h2 数据库控制台：http://localhost:8080/console<br>
	 * 使用：JDBC URL 设置 jdbc:h2:mem:testdb 用户名 sa 密码 sa 进入，可视化查看 user 表<br>
	 * 误删连接设置，开发机系统本地 ~/.h2.server.properties 文件<br>
	 * <br>
	 * 1、http://localhost:8080/user/test<br>
	 * 2、http://localhost:8080/user/test1<br>
	 * 2、http://localhost:8080/user/test2<br>
	 * 2、http://localhost:8080/user/test3<br>
	 * 2、http://localhost:8080/user/add<br>
	 * 2、http://localhost:8080/user/selectsql<br>
	 * </p>
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
//		SpringApplication.run(Application.class, args);
		logger.info("PortalApplication is sussess!");
		System.err.println("sample started. http://localhost:8080/user/test");
	}

}
