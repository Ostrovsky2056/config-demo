package com.ostrovsky.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: config-demo
 * @description: 客户端配置类Controller
 * @author: Ostrovsky
 * @create: 2018-09-14 11:13:36
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/testReadFoo")
    public String testReadFoo(){
        return foo;
    }
}
