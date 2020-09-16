package com.company.classes;

import java.util.List;

//EXAMPLE OF ENCAPSULATION
abstract class ZooEmployee {
    //name is an example of identity
    private String name;

    //function is an example of abstraction
    public ZooEmployee(String newName){this.name = newName;}

    abstract void uniform();

    abstract void doDailyWork(int day, List<Animal> animals);

    //function is an example of abstraction
    public String getName(){ return this.name;}
    //function is an example of abstraction
    public void setName(String newName){this.name = newName;}
}
