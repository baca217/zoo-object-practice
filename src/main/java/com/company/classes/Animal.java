package com.company.classes;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void wakeUp() {
        System.out.println("Default Wake up");
    }
    public void makeNoise() { System.out.println("Default Make Noise"); }
    public void eat() { System.out.println("Default Eat"); }
    abstract void roam();
    abstract void sleep();
    public String getName(){return this.name;}
}