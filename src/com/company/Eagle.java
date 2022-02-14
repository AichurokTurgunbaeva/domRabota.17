package com.company;

public class Eagle extends Animal{
    public Eagle() {
    }

    public Eagle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle is flying.");
    }
}

