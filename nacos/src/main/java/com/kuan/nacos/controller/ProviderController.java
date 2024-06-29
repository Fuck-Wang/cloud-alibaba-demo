package com.kuan.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        return "Hello Nacos Discovery " + str;
    }

}
