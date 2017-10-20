package com.xinaml.cloud.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestAct {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://cloud-provider/search",String.class);
    }
}
