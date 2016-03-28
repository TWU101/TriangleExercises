package com.mm;

public class Main {

    public static void main(String[] args) {
        Drawer drawer = new Drawer();

        //Easiest exercise ever
        drawer.printOne();

        //Draw a horizontal line
        drawer.drawHorizontalStars(8);

        //Draw a vertical line
        drawer.drawVerticalLine(3);

        //Draw a right triangle
        drawer.drawRightTriangle(5);
    }
}
