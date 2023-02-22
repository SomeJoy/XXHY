package com.itheima.demo02interfaceupgrade;

import java.util.function.Function;

public class Demo6FunctionAndThen {
    // 使用Lambda 表达式将字符串转成数字，第二个操作这个数字乘以5
    public static void main(String[] args) {

        p((str) -> {
            int i = Integer.parseInt(str);
            return i;
        },(num) -> {
            return num*5;
        });
    }
    public static void p(Function<String,Integer> f1,Function<Integer,Integer> f2){
//        System.out.println(f1.apply("30"));
//        System.out.println(f2.apply(90));
        System.out.println(f1.andThen(f2).apply("20"));
    }
}
