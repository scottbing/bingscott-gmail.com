package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // instantiate the classes
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        WarmDrPepper warmdrpepper = new WarmDrPepper();

        // test all three recipies and view the output
        coffee.prepareRecipe();
        tea.prepareRecipe();
        warmdrpepper.prepareRecipe();

    }
}
