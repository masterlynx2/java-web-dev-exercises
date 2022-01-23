package exercises;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello what is the length of the rectangle");
        Integer length = input.nextInt();
        System.out.println("what is the width of the rectangle");
        Integer width = input.nextInt();
        Integer area = length * width;

        System.out.println("The area of the rectangle is " + area);
    }
}
