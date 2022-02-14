package com.company;

public class Shark extends Animal{
    public Shark() {
    }

    public Shark(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Shark is attacking.");
    }
}



