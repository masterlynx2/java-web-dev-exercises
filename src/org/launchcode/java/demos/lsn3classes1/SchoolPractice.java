package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student antonio = new Student();
        antonio.setName("Antonio");
        antonio.setNumberOfCredits(1);
        antonio.setGpa(4.0);

        System.out.println(antonio.getName());
        System.out.println(antonio.getNumberOfCredits());
        System.out.println((antonio.getGpa()));
    }


}
