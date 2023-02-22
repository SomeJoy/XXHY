package com.itheima.demo02interfaceupgrade;

import java.util.function.Function;

public class Demo5Function {
    public static void main(String[] args) {
        printNum((str) -> {
            int i = Integer.parseInt(str);
            return i+1;
        });
    }
    public static void printNum(Function<String,Integer> function){
        Integer apply = function.apply("20");
        System.out.println(apply);
    }
}
