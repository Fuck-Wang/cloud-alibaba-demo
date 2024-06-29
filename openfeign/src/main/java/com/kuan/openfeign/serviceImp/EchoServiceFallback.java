package com.kuan.openfeign.serviceImp;

import com.kuan.openfeign.service.EchoService;

public class EchoServiceFallback implements EchoService {

    /**
     * feign异常走该逻辑
     * @param str
     * @return
     */
    @Override
    public String echo(String str) {
        return "echo fallback";
    }

}
