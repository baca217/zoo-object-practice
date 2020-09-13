package com.company.classes;

import java.util.Random;

public class Hippo extends Pachyderm {
    public Hippo(String Name){super(Name);}
    public void wakeUp() {
        System.out.println(this.getName() + " the hippo woke up");
    }
    public void makeNoise() { System.out.println(this.getName() + " the hippo makes a noise"); }
    public void eat() { System.out.println(this.getName() + " the hippo ate"); }
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println(this.getName() + " the hippo decided to rather than roam");
        }
        else{
            System.out.println(this.getName() + " the hippo decided to roam around");
        }
    }
    public void sleep() {
        System.out.println(this.getName() + " the hippo went to sleep");
    }
}
