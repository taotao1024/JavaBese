package com.lsy.java8.lambda;

import org.junit.Test;

public class InterfaceV1Test {


    @Test
    public void printUtils() {
        InterfaceV1 test = (s) -> {
            System.out.println(s);
        };
        // 调用方法
        test.printUtils("java.util.function : 下面有很多JDK自定义的工具接口");

    }
}