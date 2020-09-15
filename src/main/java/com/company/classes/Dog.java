package com.company.classes;

import java.util.Random;

public class Dog extends Canine{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Wolf Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Wolf makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " the Wolf eats something tasty");
    }

    @Override
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(9);
        if(probability > 3) {
            System.out.println(this.getName() + " the Wolf dig around the cage");
        } else {
            System.out.println(this.getName() + " the Wolf roams around the cage");
        }

    }

    @Override
    void sleep() {
        System.out.println(this.getName() + " the Wolf sleeps in the cage");
    }
}
