package com.kuan.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.kuan.sentinel.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/connect")
    // @SentinelResource注解标注在controller方法上不会进入blockHandler逻辑，标注在service方法上会进入
    @SentinelResource(value = "connect", blockHandler = "blockHandler", blockHandlerClass={ExceptionUtils.class},
            fallback = "fallbackHandler", fallbackClass = {ExceptionUtils.class})
    public String connect() {
        return "connected!";
    }

}
