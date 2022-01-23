package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


        System.out.println("what is the Radius of the circle? ");
        Double radius = input.nextDouble();
        System.out.println("The area of the circle is " +  Circle.getArea(radius));
    }
}
