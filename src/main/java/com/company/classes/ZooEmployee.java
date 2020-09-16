package com.company.classes;

abstract class ZooEmployee {
    // EXAMPLE OF ENCAPSULATION
    private String name;
    private int age;
    private String startDate;
    private String Birthday;

    public ZooEmployee(String newName){this.name = newName;}

    // EXAMPLE OF ABSTRACTION
    abstract void uniform();

    abstract void doDailyWork(int day, List<Animal> animals);

    public String getName(){ return this.name;}
    public void setName(String newName){this.name = newName;}
}
