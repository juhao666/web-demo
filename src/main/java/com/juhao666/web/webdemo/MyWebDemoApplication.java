package com.juhao666.web.webdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MyWebDemoApplication {

	public static void main(String[] args) {

		log.info("service is starting......");
		SpringApplication.run(MyWebDemoApplication.class, args);
	}

}
