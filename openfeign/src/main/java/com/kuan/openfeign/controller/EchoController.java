package com.kuan.openfeign.controller;

import com.kuan.openfeign.service.EchoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class EchoController {

    @Resource
    private EchoService echoService;

    @GetMapping("/echo/{str}")
    public String callFeignEcho(@PathVariable String str) {
        return echoService.echo(str);
    }

}
