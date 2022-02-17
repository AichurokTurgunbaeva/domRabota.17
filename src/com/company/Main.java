package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal[] animals = {new Shark("Dory", "Blue", 5),
                new Shark("Nemo", "White", 4),
                new Turtle("Tashbaka", "Grey", 21),
                new Eagle("Burkut", "Brown", 3)};

        Shark[] sharks = new Shark[2];
        int counter = 0;
        for (Animal a : animals) {
            if (a.getClass().getName().equals("com.company.Shark")) {
                if (a instanceof Shark) {
                    sharks[counter] = (Shark) a;
                    counter++;
                    a.eat();
                }
            }
        }
        Turtle[] turtles = new Turtle[1];
        int counter1 = 0;
        for (Animal b : animals) {
            if (b.getClass().getName().equals("com.company.Turtle")) {
                if (b instanceof Turtle) {
                    turtles[counter1] = (Turtle) b;
                    counter1++;
                    b.eat();
                }
            }
        }
        Eagle[] eagles = new Eagle[1];
        int counter2 = 0;
        for (Animal c : animals) {
            if (c.getClass().getName().equals("com.company.Eagle")) {
                if (c instanceof Eagle) {
                    eagles[counter2] = (Eagle) c;
                    counter2++;
                    c.eat();
                }
            }
        }
    }
}


