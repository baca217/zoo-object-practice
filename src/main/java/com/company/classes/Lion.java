package com.company.classes;

public class Lion extends Feline {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Lion Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Lion makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " the Lion eats something tasty");
    }

    @Override
    public void roam() {
        System.out.println(this.getName() + " the Lion roams around the cage");
    }
}
