package com.kuan.sentinel.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ExceptionUtils {

    public static String blockHandler(BlockException ex) {
        ex.printStackTrace();
        System.out.println(ex.getMessage());
        return "exception msg: " + ex.getMessage();
    }

    public static String fallbackHandler(Throwable throwable) {
        return "throwable msg: " + throwable.getMessage();
    }

}
