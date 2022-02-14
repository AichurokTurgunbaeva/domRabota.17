package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Shark shark = new Shark("Dory","Blue",5);
        Turtle turtle = new Turtle("Tashbaka","Grey",21);
        Eagle eagle = new Eagle("Burkut","Brown",3);

        Animal[] animals = {shark,turtle,eagle};
        Animal[] animals1 = {new Shark(),
                new Turtle(),
                new Eagle()};

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

        Animal[] tashbaka = {animals[0]};
        Animal[] balik = {animals[1]};
        Animal[] kanattuu = {animals[2]};
        
    }
}
