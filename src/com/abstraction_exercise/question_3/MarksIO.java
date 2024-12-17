package com.abstraction_exercise.question_3;

import java.util.Scanner;

public class MarksIO {
    Scanner sc = new Scanner(System.in);

    public A inputA() {
        double s1, s2, s3;
        s1 = input(1);
        s2 = input(2);
        s3 = input(3);

        return new A(s1, s2, s3);
    }

    public B inputB() {
        double s1, s2, s3, s4;
        s1 = input(1);
        s2 = input(2);
        s3 = input(3);
        s4 = input(4);
        return new B(s1, s2, s3, s4);
    }

    double input(int i) {
        double s;
        while (true) {
            System.out.print("Enter the marks in subject" + i + " =");
            double var;
            var = sc.nextDouble();
            if (var > 0 && var <= 100) {
                s = var;
                i++;
                break;
            }

        }
        return s;
    }
}
