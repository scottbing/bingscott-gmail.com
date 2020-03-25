package com.company;

public class Coffee extends CaffeinatedBeverage{

    void prepareRecipe() {
        getMug();
        boilWater();
        brewCoffeeGrounds();
        pourInCup();

    }

    @Override
    void brewBeverage() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void brewCoffeeGrounds() {
        System.out.println("Dripping Coffee");
    }

}

