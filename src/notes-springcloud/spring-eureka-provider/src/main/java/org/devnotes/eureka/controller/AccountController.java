package org.devnotes.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AccountController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Come from ProviderApplication:" + UUID.randomUUID();
    }
}
