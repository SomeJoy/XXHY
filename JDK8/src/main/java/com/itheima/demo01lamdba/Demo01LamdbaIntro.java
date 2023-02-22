package com.itheima.demo01lamdba;

public class Demo01LamdbaIntro {
    public static void main(String[] args) {
        // 使用匿名内部类的方式来实现线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行");
            }
        }).start();

        // 体验 lambda表达式
        new Thread( () -> {
            System.out.println("lam执行");
        }).start();
    }
}
