package com.itheima.demo08annotation;

import java.util.function.Consumer;

public class Demo01MethodRedlntro {
    public static void main(String[] args) {

        // 使用 Lambda 表达式求和
//        printSum((arr) -> {
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                sum+=arr[i];
//            }
//            System.out.println(sum);
//        });

        // 使用方法引用求和
        // 让这个指定的方法去重写接口的抽象方法，到时候调用接口的抽象方法就是调用传递过去的这个方法
        printSum(Demo01MethodRedlntro :: sum);
    }

    // 数组求和
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        return sum;
    }


    public static void printSum(Consumer<int[]> consumer){
        int[] arr = {11,22,33,44};
        consumer.accept(arr);
    }
}
