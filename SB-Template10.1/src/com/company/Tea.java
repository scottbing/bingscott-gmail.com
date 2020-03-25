package com.company;

public class Tea extends CaffeinatedBeverage {

    // all of the drinks start out witha gradual heating process
    @Override
    void brewBeverage() {
        System.out.println("Steeping the tea bag.");
    }

    // the hooks - eliminate the extras that are not wanted
    @Override
    boolean wantsSugar() {
        return false;
    }

    @Override
    boolean wantsMilk() {
        return false;
    }
}