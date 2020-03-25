package com.company;

public abstract class CaffeinatedBeverage {

    void prepareRecipe() {
        getMug();
        boilWater();
        brewBeverage();
        pourInCup();
        // check hooks
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

    // variants
    abstract void brewBeverage();

    // hooks
    boolean wantsCondiments() { return true; }
    boolean wantsLemon() { return true; }
    boolean wantsSugar() { return true; }
    boolean wantsMilk() { return true; }

    void addLemon() {
        System.out.println("Adding lemon");
    }

    void addSugar() {
        System.out.println("Adding sugar");
    }

    void addMilk() {
        System.out.println("Adding milk");
    }

    final void getMug() {
        System.out.println("Got Mug");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring in cup");
    }


}
