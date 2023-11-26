package org.example;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setLocation(String location) {
        System.setProperty("service.location", location);
    }
}