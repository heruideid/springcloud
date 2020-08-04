package com.nostalgia.productservice8900.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {

    @Value("${server.port}")
    int port;

    @GetMapping("/product/getProduct")
    public Map<String,Object> getProduct(){
        Map<String,Object> map=new HashMap<>();
        map.put("msg","调用商品服务~~~ 服务端口是"+port);
        map.put("status",true);
        return map;
    }
}
