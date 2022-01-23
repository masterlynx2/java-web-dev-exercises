package exercises;

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many miles have you have you driven? ");
        Double miles = input.nextDouble();
        System.out.println("how many gallons of gas have you used");
        Double gallons = input.nextDouble();
        Double mpg = miles/gallons;
        System.out.println("the Miles per gallon for your trip is: " + mpg);
    }
}
