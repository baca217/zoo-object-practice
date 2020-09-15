package com.company.classes;

public class Kangaroo extends Marsupial{
    public Kangaroo(String newName){super(newName);}
    public void wakeUp() {
        System.out.println(this.getName() + " the "+this.getType()+" woke up");
    }
    public void makeNoise() { System.out.println(this.getName() + " the "+this.getType()+" makes a noise"); }
    public void eat() { System.out.println(this.getName() + " the "+this.getType()+" ate"); }
    public void roam() {System.out.println(this.getName() + " the "+this.getType()+" decided to roam around");}
    public void sleep() { System.out.println(this.getName() + " the "+this.getType()+" went to sleep");}
}
