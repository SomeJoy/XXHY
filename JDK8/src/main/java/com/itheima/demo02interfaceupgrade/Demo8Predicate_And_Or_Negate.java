package com.itheima.demo02interfaceupgrade;

import java.util.function.Predicate;

public class Demo8Predicate_And_Or_Negate {
    /*
    使用Lambda表达式判断一个字符串中即包含W,也包含H
    使用Lambda表达式判断一个字符串中包含W或者包含H
    使用Lambda表达式判断一个字符串中不包含W
     */
    public static void main(String[] args) {

        judge(s -> {
            return s.contains("W");
        }, s -> {
            return s.contains("H");
        });
    }

    public static void judge(Predicate<String> p1, Predicate<String> p2){
        String str = "AJNFhWjo";
//        System.out.println(p1.test(str));
//        System.out.println(p2.test(str));

        // 使用Lambda表达式判断一个字符串中即包含W,也包含H
        boolean t1 = p1.and(p2).test(str);
        if (t1) {
            System.out.println("一个字符串中即包含W,也包含H1");
        }

        // 使用Lambda表达式判断一个字符串中包含W或者包含H
        boolean t2 = p1.or(p2).test(str);
        if (t2) {
            System.out.println("一个字符串中包含W或者包含H2");
        }

        // 使用Lambda表达式判断一个字符串中不包含W
        String s = "aaaa";

        boolean t3 = p2.negate().test(s);
        if (t3) {
            System.out.println("一个字符串中不包含W3");
        }


    }
}
