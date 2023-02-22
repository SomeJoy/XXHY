package com.itheima.demo02interfaceupgrade;

public class Demo03UseStaticFunction {
    public static void main(String[] args) {

        BBB b1 = new BBB();
        AAA.test01();
//        b1.test01();
//        AAA aaa = new AAA();
//        aaa.t
    }
}
interface AAA {
    public static void test01(){
        System.out.println("接口静态方法");
    }
}

class BBB implements AAA {

}