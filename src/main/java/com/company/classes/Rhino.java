package com.company.classes;

import java.util.Random;

public class Rhino extends Pachyderm{
    private String name;
    public void wakeUp() {
        System.out.println(name + " the rhino woke up");
    };
    public void makeNoise() { System.out.println(name + " the rhino grunted"); };
    public void eat() { System.out.println(name + " the rhino ate"); };
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println(name + " the rhino decided to charge");
        }
        else{
            System.out.println(name + " the rhino decided to roam around");
        }
    };
    public void sleep() {
        System.out.println(name + " the rhino went to sleep");
    };
    public void getName() {System.out.println(this.name); };
    public  void setName(String inName) {this.name = inName;};
}
