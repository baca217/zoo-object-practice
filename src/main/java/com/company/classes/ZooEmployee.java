package com.company.classes;

abstract class ZooEmployee {
    private String name;
    private int age;
    private String startDate;
    private String Birthday;

    abstract public void uniform();
    abstract public void doDailyWork(int day, Animal animals[]);
}
