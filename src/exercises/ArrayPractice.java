package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        Integer array [] =  {1,1,2,3,5,8};

        for (int i : array){
            if(i % 2!= 0){
                System.out.println(i);
            }
        }

        String str = "I would not, could not, in a box." +
                " I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
       String strArray[] = str.split(" ");


        System.out.println(Arrays.toString(strArray));

        String stra = "I would not, could not, in a box." +
                " I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String strArray2[] = stra.split("\\.");
        System.out.println(Arrays.toString(strArray2));
    }




}
