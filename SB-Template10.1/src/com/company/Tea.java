package com.company;

public class Tea extends CaffeinatedBeverage {

    void prepareRecipe() {
        getMug();
        boilWater();
        steepInBag();
        pourInCup();
    }

    @Override
    void brewBeverage() {
        System.out.println("Steeping the tea bag.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon.");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void steepInBag() {
        System.out.println("Steeping In Bag");
    }

}