package com.baomidou.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.baomidou.springboot.config.SpringConfig;

@SpringBootApplication
@Import(value={SpringConfig.class})
public class Application {

	/**
	 * <p>
	 * 测试 RUN
	 * <br>
	 * 1、http://localhost:8080/user/test<br>
	 * 2、http://localhost:8080/user/test1<br>
	 * </p>
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
//		SpringApplication.run(Application.class, args);
	}

}
