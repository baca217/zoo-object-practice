package com.company.classes;

import java.util.Random;

public class Feline extends Animal {
    public void onCall() {
        Random noiseProbability = new Random();
        Random roamingProbability = new Random();
        Random sleepProbability = new Random();
        noiseProbability.nextInt(9);
        roamingProbability.nextInt(9);
        sleepProbability.nextInt(9);

        if(noiseProbability.nextInt(9) < 3) {
            this.makeNoise();
        }

        if(roamingProbability.nextInt(9) < 3) {
            this.roam();
        }

        if(sleepProbability.nextInt(9) < 4) {
            this.sleep();
        }
    }
}
