package com.abstraction_exercise.question_3;

public class MarksExecutor {
    public static void main(String[] args) {
        MarksIO marksIO = new MarksIO();
        System.out.println("Enter the three subject marks (0-100):");
        A a = marksIO.inputA();
        System.out.println("Enter the four subject marks (0-100):");
        B b = marksIO.inputB();

//        displaying the child A

        System.out.println(a.getPercentage());

//        displaying the child B
        System.out.println(b.getPercentage());

    }
}
