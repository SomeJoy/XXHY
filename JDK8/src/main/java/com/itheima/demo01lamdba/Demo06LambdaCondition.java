package com.itheima.demo01lamdba;

public class Demo06LambdaCondition {
    public static void main(String[] args) {

        goEat(() -> {
            System.out.println("l1");
        });

        goEat(new Student() {
            @Override
            public void eat() {
                System.out.println("n1");
            }
        });

        Student s = () -> {
            System.out.println("l2");
        };
    }

    public static void goEat(Student s){
        s.eat();
    }
}

// 只有一个抽象方法的接口称为函数式接口，我们就能使用 Lamdba
@FunctionalInterface // 监测这个接口是不是只有一个抽象方法
 interface Student{
    // 接口在有且仅有一个抽象方法
    public abstract void eat();
//    public abstract void paly();
}