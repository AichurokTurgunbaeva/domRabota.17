package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal[] animals = {new Shark("Dory","Blue",5),
                new Turtle("Tashbaka","Grey",21),
                new Eagle("Burkut","Brown",3)};

        for (Animal a : animals) {
            if (a.getClass().getName().equals("com.company.Shark")) {
                a.eat();
            }
        }
        for (Animal b : animals) {
            if (b instanceof Turtle) {
                b.eat();
            }
        }
        for (Animal c : animals) {
            if (c.getClass().getName().equals("com.company.Eagle")) {
                c.eat();
            }
        }

        Shark[] sharks = {(Shark) animals[0]};
        Turtle[] turtles = {(Turtle) animals[1]};
        Eagle[] eagles = {(Eagle) animals[2]};

    }
}
