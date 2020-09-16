package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Cat extends Feline {//extension is an example of polymorphism
    //name is an example of identity
    public Cat(String name) {
        super(name);
    }

    //EXAMPLE OF ABSTRACTION
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Cat Wakes up");
    }

    //EXAMPLE OF ABSTRACTION
    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Cat makes a noise");
    }
    //EXAMPLE OF ABSTRACTION
    @Override
    public void eat() {
        System.out.println(this.getName() + " the Cat eats something tasty");
    }
    //EXAMPLE OF ABSTRACTION
    @Override
    public void roam() {
        System.out.println(this.getName() + " the Cat roams around the cage");
    }
}
