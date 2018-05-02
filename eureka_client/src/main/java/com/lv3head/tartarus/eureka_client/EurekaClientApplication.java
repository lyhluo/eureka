package com.lv3head.tartarus.eureka_client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * eureka-client 已转换为基于consul服务治理的服务提供者
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				EurekaClientApplication.class)
				.web(true).run(args);

	}
}
