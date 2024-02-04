package com.hw.maxim;

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat();

//        barsik.name = "Barsik";
        barsik.setName("Barsik");
        barsik.setAge(4);
        barsik.setHungry(true);

        System.out.println(barsik);
        barsik.feed();



        barsik.setHungry(false);
        System.out.println(barsik);
        barsik.feed();
//        barsik.eat();




        // ...

//        barsik.name = "Kuzma";
//        System.out.println(barsik);
    }
}
