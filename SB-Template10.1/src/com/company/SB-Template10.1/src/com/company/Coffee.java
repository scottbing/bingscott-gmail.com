package com.company;

public class Coffee extends CaffeinatedBeverage{

    void brewBeverage() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    boolean wantsLemon() {
        return false;
    }

    @Override
    boolean wantsSugar() {
        return false;
    }


}

