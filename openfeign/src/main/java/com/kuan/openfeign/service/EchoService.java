package com.kuan.openfeign.service;

import com.kuan.openfeign.config.FeignConfiguration;
import com.kuan.openfeign.serviceImp.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
// name = "provider",name属性定义nacos服务的服务名称
@FeignClient(name = "provider", fallback = EchoServiceFallback.class, configuration = FeignConfiguration.class)
public interface EchoService {

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str);

}
