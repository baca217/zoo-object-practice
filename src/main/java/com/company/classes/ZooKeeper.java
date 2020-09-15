package com.company.classes;

public class ZooKeeper extends ZooEmployee{
    public ZooKeeper(String Name){super(Name);}
    public void doDailyWork(int day, Animal[] animals){
        System.out.println("Zookeeper "+this.getName()+" arrived for day "+day+".");
        uniform();
        wakeAnimals(animals);
        roleCallAnimals(animals);
        feedAnimals(animals);
        exerciseAnimals(animals);
        sleepAnimals(animals);
        System.out.println("Zookeeper "+this.getName()+" has left for day "+day+".\n");
    }
    @Override
    public void uniform(){
        System.out.println("Zookeeper put on their uniform");
    }

    private void wakeAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            //need to figure out how we will pull name and animal type from Animal superclass
            System.out.println("Zookeeper "+this.getName()+" tried to wake up "+animals[i].getName()+" the "+animals[i].getType());
            animals[i].wakeUp();
        }
    }

    private void roleCallAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            System.out.println("Zookeeper "+this.getName()+" tried to role call "+animals[i].getName()+" the "+animals[i].getType());
            animals[i].makeNoise();
        }
    }

    private void feedAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            System.out.println("Zookeeper "+this.getName()+" tried to feed "+animals[i].getName()+" the "+animals[i].getType());
            animals[i].eat();
        }
    }

    private void exerciseAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            System.out.println("Zookeeper "+this.getName()+" tried to exercise "+animals[i].getName()+" the "+animals[i].getType());
            animals[i].roam();
        }
    }

    private void sleepAnimals(Animal[] animals){
        int i;
        for(i = 0; i < animals.length; i++){
            System.out.println("Zookeeper "+this.getName()+" tells "+animals[i].getName()+" the "+animals[i].getType() + " to sleep.");
            animals[i].sleep();
        }
    }
}
