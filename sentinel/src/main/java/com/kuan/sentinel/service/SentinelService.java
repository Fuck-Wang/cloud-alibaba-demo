package com.kuan.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class SentinelService {

    // @SentinelResource注解标注在controller方法上不会进入blockHandler逻辑，标注在service方法上会进入
    @SentinelResource(value = "SentinelService#hello", blockHandler = "exceptionHandler", fallback = "fallback")
    public String hello() {
        return "hello sentinel";
    }

    @SentinelResource(value = "demo#echo", blockHandler = "exceptionHandler", fallback = "fallback")
    public String echo(String str) {
        return "str: " + str;
    }

    public String exceptionHandler(String str) {
        return "block handler ....";
    }

    public String fallback(String str) {
        return "fall back ...";
    }

    public String exceptionHandler(BlockException ex) {
        ex.printStackTrace();
        System.out.println(ex.getMessage());
        return "exception msg: " + ex.getMessage();
    }

    public String fallback(Throwable throwable) {
        return "throwable msg: " + throwable.getMessage();
    }

}
