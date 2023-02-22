package com.itheima.demo01lamdba;

public class Demo04LambdaImpl {
    public static void main(String[] args) {
        goSwim(new Swimmable() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类实现游泳");
            }
        });
    }

    public static void goSwim(Swimmable swimmable) {
        swimmable.swimming();
    }
}
