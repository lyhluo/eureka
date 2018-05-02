package com.lv3head.tartarus.spring_cloud_consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Deprecated
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConsulApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				SpringCloudConsulApplication.class)
				.web(true).run(args);
	}
}
