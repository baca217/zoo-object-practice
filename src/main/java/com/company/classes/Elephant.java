package com.company.classes;

import java.util.Random;

public class Elephant extends Pachyderm{
    public Elephant(String Name){super(Name);}
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the elephant woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the elephant makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the elephant ate"); }
    @Override
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println(this.getName() + " the elephant decided to charge rather than roam");
        }
        else{
            System.out.println(this.getName() + " the elephant decided to roam around");
        }
    }
    @Override
    public void sleep() {
        System.out.println(this.getName() + " the elephant went to sleep");
    }
}
