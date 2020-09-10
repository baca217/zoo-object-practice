package com.company.classes;

import java.util.Random;

public class Hippo extends Pachyderm {
    private String name;
    public void wakeUp() {
        System.out.println(name + " the hippo woke up");
    };
    public void makeNoise() { System.out.println(name + " the hippo grunted"); };
    public void eat() { System.out.println(name + " the hippo ate"); };
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println(name + " the hippo decided to charge");
        }
        else{
            System.out.println(name + " the hippo decided to roam around");
        }
    };
    public void sleep() {
        System.out.println(name + " the hippo went to sleep");
    };
    public void getName() {System.out.println(this.name); };
    public  void setName(String inName) {this.name = inName;};
}
