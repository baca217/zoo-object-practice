package com.company.classes;

import java.util.Random;

public class Hippo extends Pachyderm {
    public Hippo(String name){super(name);}
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the hippo woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the hippo makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the hippo ate"); }
    @Override
    public void sleep() {
        System.out.println(this.getName() + " the hippo went to sleep");
    }
}
