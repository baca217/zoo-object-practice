package com.company.classes;

import com.company.classes.Animal;

import java.util.Random;

public class Pachyderm  extends Animal {
    public void roam(){
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println("Pachyderm decided to charge");
        }
        else{
            System.out.println("Pachyderm decided to roam around");
        }
    }

    public void sleep(){};
}
