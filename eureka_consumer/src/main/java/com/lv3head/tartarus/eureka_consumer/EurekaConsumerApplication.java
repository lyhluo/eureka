package com.lv3head.tartarus.eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lyh
 */
// @EnableDiscoveryClient 用来将当前应用加入到服务治理体系中
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate () {
		return new RestTemplate();
	}
}
