package Practical02;

import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mark Acceptance
        System.out.print("Enter the Number of Students : ");
        int size = sc.nextInt();

        int [] marks = new int[size];
        System.out.println("Enter the marks Of Students out of 100 : ");
        for(int i = 0; i < size; i++){
            System.out.print("Marks of student["+(i+1)+"] : ");
            marks[i] = sc.nextInt();
        }

        // Student with Marks More than 50
        int above50 = 0;
        for(int i = 0; i < size; i++){
            if(marks[i] > 50){
                above50 += 1;
            }
        }

        // perfect 100 marks
        boolean perfect100 = false;
        for (int i = 0; i < size; i++) {
            if(marks[i] == 100){
                perfect100 = true;
            }
        }

//        // avg marks of class
//        int total = 0;
//        for (int i = 0; i < size; i++) {
//            marks[i] += total;
//        }
//        double avgMarks ;
//        avgMarks = total / 2;

        // display data
        System.out.println("\nNumber of students Scored above 50 : "+ above50);
        System.out.println("Any Student with Perfect 100 marks : "+ perfect100);
//        System.out.println("Average Marks Of class : "+ avgMarks);




    }
}
