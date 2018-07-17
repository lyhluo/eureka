package com.lv3head.tartarus.eureka_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * eureka-client 已转换为基于consul服务治理的服务提供者
 * @author  lyh
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
	// 启动的时候要注意，由于我们在controller中注入了RestTemplate，所以启动的时候需要实例化该类的一个实例
	@Autowired
	private RestTemplateBuilder builder;

	// 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
	@Bean
	public RestTemplate restTemplate() {
		return builder.build();
	}
	public static void main(String[] args) {
		new SpringApplicationBuilder(
				EurekaClientApplication.class)
				.web(true).run(args);

	}
}
