package com.company.classes;

import java.util.Random;

public class Feline extends Animal {

    @Override
    void sleep() {
        Random rand = new Random();
        int probability = rand.nextInt(9);

        if(probability < 3) {
            this.makeNoise();
        }

        if(probability >= 3 && probability < 6 ) {
            this.roam();
        }

        if(probability >= 6) {
            this.sleep();
        }
    }
}
