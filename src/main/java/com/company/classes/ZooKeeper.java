package com.company.classes;

public class ZooKeeper extends ZooEmployee{
    public ZooKeeper(String Name){super(Name);}
    public void uniform(){}
    public void doDailyWork(int day, Animal[] animals){
        System.out.println("Zookeeper "+name+" arrived for day "+day);
        wakeAnimals(animals);
        roleCallAnimals(animals);
        feedAnimals(animals);
        exerciseAnimals(animals);
        sleepAnimals(animals);
        System.out.println("Zookeeper "+name+" has left for day "+day);
    }

    private void wakeAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            //need to figure out how we will pull name and animal type from Animal superclass
            System.out.println("Zookeeper");
            animals[i].wakeUp();
        }
    }

    private void roleCallAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            animals[i].makeNoise();
        }
    }

    private void feedAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            animals[i].eat();
        }
    }

    private void exerciseAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            animals[i].roam();
        }
    }

    private void sleepAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            animals[i].sleep();
        }
    }
}
