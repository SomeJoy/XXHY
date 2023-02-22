package com.itheima.demo02interfaceupgrade;

public class Demo01InterfaceDefaultIntro {
}
/*
    传统接口的使用，接口中新增抽象方法，他的实现类就会报错
 */
interface A{
    public abstract  void test01();
//    public abstract  void test03();
}
class B implements A{

    @Override
    public void test01() {
        System.out.println("B");
    }
}

class C implements A{

    @Override
    public void test01() {
        System.out.println("c");
    }
}