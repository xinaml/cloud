package com.xinaml.cloud.user;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestAct {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://user-provider/search",String.class);
    }
@Autowired
private HelloService service;
    @GetMapping("/test/error")
    public String error(){
        return service.hiService("xxx");
    }

}
