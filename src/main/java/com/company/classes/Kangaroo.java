package com.company.classes;

public class Kangaroo extends Marsupial{
    public Kangaroo(String newName){super(newName);}
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the "+this.getType()+" woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the "+this.getType()+" makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the "+this.getType()+" ate"); }
    @Override
    public void roam() {System.out.println(this.getName() + " the "+this.getType()+" decided to roam around");}
    @Override
    public void sleep() { System.out.println(this.getName() + " the "+this.getType()+" went to sleep");}
}
