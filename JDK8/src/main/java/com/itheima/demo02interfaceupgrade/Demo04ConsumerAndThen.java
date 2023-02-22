package com.itheima.demo02interfaceupgrade;

import java.util.function.Consumer;

public class Demo04ConsumerAndThen {
    public static void main(String[] args) {

        PringHello((Integer i) -> {
            System.out.println(i+1);
        },(Integer i) -> {
            System.out.println(i-1);
        });
    }

    public static void PringHello(Consumer<Integer> c1,Consumer<Integer> c2){
        System.out.println("开始了");
//        c1.accept(22);
//        c2.accept("Ghyujjhy");
        c1.andThen(c2).accept(1);
    }
}
