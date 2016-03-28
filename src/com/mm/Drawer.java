package com.mm;

public class Drawer {

    public void printOne() {
        System.out.println("*");
    }

    public void drawHorizontalStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
}