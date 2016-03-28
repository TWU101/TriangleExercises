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

    public void drawVerticalLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int number) {
        for (int i = 1; i <= number + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}