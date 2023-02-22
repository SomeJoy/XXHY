package com.itheima.demo02interfaceupgrade;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo02Supplier {
    public static void main(String[] args) {
        test01(() -> {

            int[] arr = {77,88,55,99};
            Arrays.sort(arr);
//            return arr[arr.length-1];
            return arr[0];
        });
    }

    public static void test01(Supplier<Integer> supplier){
        Integer integer = supplier.get();
        System.out.println(integer);
    }
}
