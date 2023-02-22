package com.itheima.demo02interfaceupgrade;

import java.util.function.Consumer;

public class Demo03Consumer {
    public static void main(String[] args) {
        printHello((Integer a) -> {
            System.out.println(a+1);
        });
    }

    public static void printHello(Consumer<Integer> consumer){
        consumer.accept(1);
    }
}
