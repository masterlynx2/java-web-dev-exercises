package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);

        System.out.println(sum(numbers));
    }


    public static int sum(ArrayList<Integer> arr) {

        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static String wordy(ArrayList<String> givenword) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("yikes",
                        "mike",
                        "bottle",
                        "niner",
                        "three",
                        "lions")
        );

        for (String word : givenword) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }



        return (wordy(words));
    }

}









