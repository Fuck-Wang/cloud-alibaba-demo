package com.kuan.sentinel.controller;

import com.kuan.sentinel.service.SentinelService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class SentinelController {

    @Resource
    private SentinelService sentinelService;

    @GetMapping("/hello")
    public String hello() {
        return sentinelService.hello();
    }

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return sentinelService.echo(str);
    }

}
