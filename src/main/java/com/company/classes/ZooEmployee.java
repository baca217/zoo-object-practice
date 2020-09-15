package com.company.classes;

import java.util.List;

abstract class ZooEmployee {
    private String name;
    private int age;
    private String startDate;
    private String Birthday;

    public ZooEmployee(String newName){this.name = newName;}
    abstract void uniform();

    abstract void doDailyWork(int day, List<Animal> animals);

    public String getName(){ return this.name;}
    public void setName(String newName){this.name = newName;}
}
