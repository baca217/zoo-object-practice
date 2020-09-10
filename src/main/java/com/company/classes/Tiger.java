package com.company.classes;

public class Tiger extends Feline {

    private final String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void wakeUp() {
        System.out.println(name + " the Tiger Wakes up");
    };

    @Override
    public void makeNoise() {
        System.out.println(name + " the Tiger makes a noise");
    };

    @Override
    public void eat() {
        System.out.println(name + " the Tiger eats something tasty");
    };

    @Override
    public void roam() {
        System.out.println(name + " the Tiger roams around the cage");
    };

    @Override
    public void sleep() {
        System.out.println(name + " decides to sleep");
    };

    public String getName() {
        return name;
    }
}
