package com.hw.maxim;

public class Cat {

    private String name;

    private int age;

    private boolean isHungry;

    public void feed() {
        if (isHungry) {
            System.out.println("Насыпать корм");
            sayMeow();
            eat();
        } else {
            System.out.println("Питомец не голоден");
        }
    }

    public void sayMeow() {
        System.out.println("Мяу");
    }

    private void eat() {
        sayMeow();
        System.out.println("Большое спасибо, было вкусно!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
