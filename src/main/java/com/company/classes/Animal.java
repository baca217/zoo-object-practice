package com.company.classes;

import java.util.Scanner;

public abstract class Animal {
    private String name;

    public Animal(String newName) {
        String type = this.getClass().getSimpleName().toLowerCase();
        char firstChar = type.charAt(0);
        Scanner scan = new Scanner(System.in);
        while(firstChar != newName.charAt(0))
        {
            System.out.println("Please enter a name that begins with "+firstChar+" for animal "+type+".");
            newName = scan.nextLine().toLowerCase();
        }
        this.name = newName;
    }
    public void wakeUp() {
        System.out.println("Default Wake up");
    }
    public void makeNoise() { System.out.println("Default Make Noise"); }
    public void eat() { System.out.println("Default Eat"); }
    abstract void roam();
    abstract void sleep();
    public String getName(){return this.name;}
    public void setName(String newName){name = newName; }
    public String getType(){return this.getClass().getSimpleName();}
}