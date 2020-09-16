package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Wolf extends Canine{//extension is an example of polymorphism
    //name is an example of identity
    public Wolf(String name) {
        super(name);
    }
    //all functions are examples of abstraction
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Wolf Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Wolf makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " the Wolf eats something tasty");
    }

    @Override
    public void roam() {
        System.out.println(this.getName() + " the Wolf roams around the cage");
    }

    @Override
    void sleep() {
        System.out.println(this.getName() + " the Wolf sleeps in the cage");
    }
}
