package com.itheima.demo01lamdba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03LambdaParam {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(12,"a",150));
        list.add(new Person(13,"h",180));
        list.add(new Person(6,"u",110));

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Collections.sort(list,(Person o1,Person o2) ->{
//            return o1.getAge() - o2.getAge();
//        });

        Collections.sort(list,(o1,o2) -> o1.getAge() - o2.getAge());

//        list.forEach((t) -> {
//            System.out.println(t);
//        });
        list.forEach(t ->  System.out.println(t));
    }
}
