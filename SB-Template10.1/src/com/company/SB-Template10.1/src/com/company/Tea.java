package com.company;

public class Tea extends CaffeinatedBeverage {

    @Override
    void brewBeverage() {
        System.out.println("Steeping the tea bag.");
    }

    @Override
    boolean wantsSugar() {
        return false;
    }

    @Override
    boolean wantsMilk() {
        return false;
    }
}