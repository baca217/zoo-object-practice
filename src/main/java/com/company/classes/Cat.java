package com.company.classes;

public class Cat extends Feline {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void wakeUp() {
        System.out.println(name + " the Cat Wakes up");
    };

    @Override
    public void makeNoise() {
        System.out.println(name + " the Cat makes a noise");
    };

    @Override
    public void eat() {
        System.out.println(name + " the Cat eats something tasty");
    };

    @Override
    public void roam() {
        System.out.println(name + " the Cat roams around the cage");
    };

    @Override
    public void printInfo() {
        System.out.println("Default Print Info");
    };

    public String getName() {
        return name;
    }
}
