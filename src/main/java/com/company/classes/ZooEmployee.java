package com.company.classes;

abstract class ZooEmployee {
    protected String name;
    protected int age;
    protected String startDate;
    protected String Birthday;

    public ZooEmployee(String newName){this.name = newName;}
    abstract public void uniform();
    abstract public void doDailyWork(int day, Animal[] animals);
}
