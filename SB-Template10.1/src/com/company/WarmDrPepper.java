package com.company;

public class WarmDrPepper extends CaffeinatedBeverage{

    // all of the drinks start out witha gradual heating process
    @Override
    void brewBeverage() {
        System.out.println("Heating the Dr. Pepper");
    }

    // the hooks - eliminate the extras that are not wanted
    @Override
    boolean wantsMilk() {
        return false;
    }

    @Override
    boolean wantsSugar() {
        return false;
    }

}
