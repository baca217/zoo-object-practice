package com.company.classes;

import java.util.Random;

public class Elephant extends Pachyderm{
    public Elephant(String name){super(name);}
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the elephant woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the elephant makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the elephant ate"); }
    @Override
    public void sleep() {
        System.out.println(this.getName() + " the elephant went to sleep");
    }
}
