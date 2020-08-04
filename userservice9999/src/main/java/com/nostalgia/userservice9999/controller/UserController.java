package com.nostalgia.userservice9999.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@Slf4j
public class UserController {

    @Value("${server.port}")
    int port;

    @GetMapping("/user/findAllProduct")
    public Map<String,Object> findAllProduct(){
        RestTemplate restTemplate=new RestTemplate();
        log.info("用户服务==调用==商品服务");
        Map<String,Object> forObject=restTemplate.getForObject("http://localhost:8900/product/getProduct",Map.class);
        return forObject;
    }
}
