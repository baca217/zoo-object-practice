package com.company.classes;

public abstract class Animal {
    public void wakeUp() {
        System.out.println("Default Wake up");
    };
    public void makeNoise() { System.out.println("Default Make Noise"); };
    public void eat() { System.out.println("Default Eat"); };
    public void roam() { System.out.println("Default Roam"); };
    public void sleep() {
        System.out.println("Default Sleep");
    };
    public void printInfo() {
        System.out.println("Default Print Info");
    };
}