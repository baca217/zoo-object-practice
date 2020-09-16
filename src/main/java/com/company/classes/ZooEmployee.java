package com.company.classes;

import java.util.List;

abstract class ZooEmployee { //abstract class
    //encapsulation
    private String name;

    public ZooEmployee(String newName){this.name = newName;}
    abstract void uniform();

    abstract void doDailyWork(int day, List<Animal> animals);

    public String getName(){ return this.name;}
    public void setName(String newName){this.name = newName;}
}
