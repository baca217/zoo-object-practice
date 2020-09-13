package com.company.classes;

public class Tiger extends Feline {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void wakeUp() {
        System.out.println(name + " the Tiger Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " the Tiger makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(name + " the Tiger eats something tasty");
    }

    @Override
    public void roam() {
        System.out.println(name + " the Tiger roams around the cage");
    }

    public String getName() {
        return name;
    }
}
