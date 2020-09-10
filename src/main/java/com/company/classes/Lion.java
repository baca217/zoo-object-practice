package com.company.classes;

public class Lion extends Feline {

    private final String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void wakeUp() {
        System.out.println(name + " the Lion Wakes up");
    };

    @Override
    public void makeNoise() {
        System.out.println(name + " the Lion makes a noise");
    };

    @Override
    public void eat() {
        System.out.println(name + " the Lion eats something tasty");
    };

    @Override
    public void roam() {
        System.out.println(name + " the Lion roams around the cage");
    };


    @Override
    public void printInfo() {
        System.out.println("Default Print Info");
    };

    public String getName() {
        return name;
    }
}
