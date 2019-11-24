package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLabpart2 {

    public static void main(String[] args) {

        University university1 = new University();
        University university2 = new University();
       // System.out.println("Uni 1 " + university1);
       // System.out.println("Uni 2 " + university2);
        float Sum = 0;
        Sum = university1.average + university2.average;
        System.out.println("Universities average is  " + Sum/2);
    }

}


class Student {
    String name;
    int age;
    float mark;
    static int i = 1;
    Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of student" + i + ": ");
        name = scanner.nextLine();
        System.out.println("Write age of student" + i + ": ");
        age = scanner.nextInt();
        System.out.println("Write mark of student" + i++ + ": ");
        String inputString = scanner.next();
        mark = Float.parseFloat(inputString);



    }
}

class University {
    String title;
    int foundationYear;
    Student[] students;
    float average;



    University() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write title of university" + " : " );
        title = scanner.nextLine();
        System.out.println("Write foundationYear of university" + " : ");
        foundationYear = scanner.nextInt();

        InputHelper helper = new InputHelper();
        students = helper.getStudents();

        InputHelper helper2 = new InputHelper();
        average = helper2.getAverage(students);


    }

}





