package org.launchcode.java.demos.lsn4classes2;



public class SchoolPractice {
    public static void main(String[] args) {

        Student Tony = new Student("tony",23,21,3.0);
        Tony.addGrade(24,3.5);
        System.out.println(Tony.getGpa());

        Student Bob = new Student("Bob",2, 21,3.0);
        System.out.println(Tony.toString());
    }


}
