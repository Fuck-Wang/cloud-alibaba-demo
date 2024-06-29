package com.kuan.sentinel.controller;

import com.kuan.sentinel.service.SentinelService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")
public class SentinelController {

    @Resource
    private SentinelService sentinelService;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return sentinelService.hello();
    }

    @GetMapping("/**")
    public String ghello() {
        return sentinelService.hello();
    }

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return sentinelService.echo(str);
    }

    @GetMapping("/call/provider/echo/{str}")
    public String callProviderEcho(@PathVariable String str) {
        // 如果restTemplate配置标注了注解@SentinelRestTemplate，path路径将加入sentinel控制，不标注则不加入
        String path = String.format("http://provider/echo/" + str, "sentinel");
        return restTemplate.getForObject(path, String.class);
    }

}
