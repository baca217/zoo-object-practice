package com.company.classes;

public class Cat extends Feline {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Cat Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Cat makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " the Cat eats something tasty");
    }

    @Override
    public void roam() {
        System.out.println(this.getName() + " the Cat roams around the cage");
    }
}
