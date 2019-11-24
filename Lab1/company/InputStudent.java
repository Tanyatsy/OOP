package com.company;

class InputHelper {
    public Student[] getStudents() {

        Student[] students = new Student[3];
        System.out.println("Enter students:");
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(" Name: " + students[i].name + " Age: " + students[i].age + " Mark: " + students[i].mark);
        }

        return students;


}
    public float getAverage(Student[] students) {
        float Sum = 0;

        for (int i = 0; i < students.length; i++) {

            Sum += students[i].mark;
        }

        System.out.println(Sum/students.length);
        return Sum/students.length;
    }
}





