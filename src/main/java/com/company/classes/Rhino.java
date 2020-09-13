package com.company.classes;

import java.util.Random;

public class Rhino extends Pachyderm{
    public Rhino(String Name){super(Name);}
    public void wakeUp() {
        System.out.println(name + " the rhino woke up");
    }
    public void makeNoise() { System.out.println(name + " the rhino makes a noise"); }
    public void eat() { System.out.println(name + " the rhino ate"); }
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println(name + " the rhino decided to charge rather than roam");
        }
        else{
            System.out.println(name + " the rhino decided to roam around");
        }
    }
    public void sleep() {
        System.out.println(name + " the rhino went to sleep");
    }
}
