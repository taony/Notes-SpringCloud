package org.devnotes.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/test")
    public String GetProvider() {
        String s = restTemplate.getForObject("http://CLOUD-PROVIDER-SERVICE/hello", String.class);
        System.out.println(s);
        return s;
    }

}
