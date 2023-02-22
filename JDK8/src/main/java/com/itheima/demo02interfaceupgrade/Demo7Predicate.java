package com.itheima.demo02interfaceupgrade;

import java.util.function.Predicate;

public class Demo7Predicate {
    // 使用Lambda 判断一个人名如果超过3个字就认为是很长的名字
    public static void main(String[] args) {

        isLongName(name -> {
            return name.length()>3;
        });
    }

    public static void isLongName(Predicate<String> predicate){
        boolean boo = predicate.test("avcd");
        System.out.println(boo);
    }
}
