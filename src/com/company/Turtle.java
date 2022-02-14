package com.company;

public class Turtle extends Animal{
    public Turtle() {
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Turtle is swimming.");
    }
}

