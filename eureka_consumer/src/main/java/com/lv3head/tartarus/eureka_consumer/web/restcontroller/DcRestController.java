package com.lv3head.tartarus.eureka_consumer.web.restcontroller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DcRestController {

    /**
     * 通过LoadBalancerClient接口来获取某个服务的具体实例，并根据实例信息来发起服务接口消费请求
     *
     */
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
