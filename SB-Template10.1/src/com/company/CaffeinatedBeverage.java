package com.company;

public abstract class CaffeinatedBeverage {

    void prepareRecipe() {
        getMug();
        boilWater();
        brewBeverage();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
        if (wantsLemon()) {
            addLemon();
        }
        if (wantsSugar()) {
            addSugar();
        }
        if (wantsMilk()) {
            addMilk();
        }

    }

    abstract void brewBeverage();
    abstract void addCondiments();

    boolean wantsCondiments() { return true; }
    boolean wantsLemon() { return true; }
    boolean wantsSugar() { return true; }
    boolean wantsMilk() { return true; }

    final void getMug() {
        System.out.println("Got Mug");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring in cup");
    }

    void addLemon() {
        System.out.println("Adding lemon");
    }

    void addSugar() {
        System.out.println("Adding sugar");
    }

    void addMilk() {
        System.out.println("Adding milk");
    }

}
