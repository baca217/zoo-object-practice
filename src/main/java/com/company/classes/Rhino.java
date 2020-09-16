package com.company.classes;

import java.util.Random;

public class Rhino extends Pachyderm{
    public Rhino(String name){super(name);}
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the rhino woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the rhino makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the rhino ate"); }
    @Override
    public void sleep() {
        System.out.println(this.getName() + " the rhino went to sleep");
    }
}
