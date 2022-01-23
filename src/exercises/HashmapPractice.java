package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String>  students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("eneter the student name or press enter to finish: ");

        do{
            System.out.print("Student ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.print("Student ID ");
                Integer id = input.nextInt();
                students.put(id, newStudent);
            }
        } while(!newStudent.equals(""));

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            student.getValue();
        }
        }
    }


