package com.samsung.model;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void printInfo(int count) {
        for (int i = 0; i < count; i++) {
            printInfo();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
