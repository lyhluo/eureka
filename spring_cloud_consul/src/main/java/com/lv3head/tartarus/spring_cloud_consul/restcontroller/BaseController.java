package com.lv3head.tartarus.spring_cloud_consul.restcontroller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BaseController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
        return JSON.toJSONString(services);
    }
}
