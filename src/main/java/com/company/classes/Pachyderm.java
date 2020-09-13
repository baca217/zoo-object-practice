package com.company.classes;

import java.util.Random;

public class Pachyderm  extends Animal {
    public Pachyderm(String Name){super(Name);}
    public void roam(){
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println("Pachyderm decided to charge rather than roam");
        }
        else{
            System.out.println("Pachyderm decided to roam around");
        }
    }

    public void sleep(){}
}
