package com.kuan.sentinel.exception;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

public class ExceptionUtils {

    public static String blockHandler(BlockException ex) {
        ex.printStackTrace();
        System.out.println(ex.getMessage());
        return "exception msg: " + ex.getMessage();
    }

    public static String fallbackHandler(Throwable throwable) {
        return "throwable msg: " + throwable.getMessage();
    }


    public static ClientHttpResponse blockHandler(HttpRequest request, byte[] body,
                                                  ClientHttpRequestExecution execution, BlockException ex) {
        return new SentinelClientHttpResponse();
    }

}
