package com.itheima.demo01lamdba;

public class Demo02LambdaUse {
    public static void main(String[] args) {
        // 使用匿名内部类来实现方法
        goswim(new Swimming() {
            @Override
            public void swiming() {
                System.out.println("匿名内部类的游泳");
            }
        });
        goswim(() -> {
            System.out.println("Lambda的游泳");
        });

        System.out.println("------------------------------");
        goSmoking(new Smoking() {
            @Override
            public int somkeing(String name) {
                System.out.println("匿名内部类" + name);
                return 1;
            }
        });

        goSmoking((String name) -> {
            System.out.println("Lambda表达式:" + name);
            return 2;
        });

        System.out.println("---------------------------");
        goPlaying(new Playing() {
            @Override
            public String go(int age,int wei) {
                System.out.println(age+ " : " + wei);
                return "palying";
            }
        });

        goPlaying((age,wei) -> {
            System.out.println(age+ " : " + wei);
            return "palying2";
        });



    }

    // 有参有返回值的Lambda
    public static void goSmoking(Smoking s){
        int n = s.somkeing("aa");
        System.out.println(n);
    }


    // 无参无返回值的Lambda
    public static void goswim(Swimming a){
        a.swiming();
    }

    // 有参有返回值的Lambda
    public static void goPlaying(Playing p){
        String go = p.go(12,56);
        System.out.println(go);
    }
}
