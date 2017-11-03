package com.springcloud.springclouddemo;

import com.springcloud.springclouddemo.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
//@EnableScheduling//启用cron
@EnableEurekaServer//启用springcloud eureka服务注册
@RestController
@SpringBootApplication
public class SpringcloudDemoApplication {
	private static final String  templateStr = "Hello, %s ! Welcome to Spring Boot...";
	private final AtomicLong counter = new AtomicLong();
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/greeting")
	public User greeting(@RequestParam(value = "name",defaultValue = "World") String name){
		logger.info("## Info  Information ##: {}", name);
		logger.warn("## Warn  Information ##: {}", name);
		logger.error("## Error Information ##: {}", name);
		return new User(counter.incrementAndGet(),String.format(templateStr,name));
	}
	@RequestMapping("/")
	public String Hello(){
		return "Hello, Spring Boot... ";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoApplication.class, args);
	}
}
