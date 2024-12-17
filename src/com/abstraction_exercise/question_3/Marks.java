package com.abstraction_exercise.question_3;

public abstract class Marks {
    abstract double getPercentage();
}


class A extends Marks {
    double s1, s2, s3;

    public A(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getPercentage() {
        double total = s1 + s2 + s3;
        return (total * 100) / 300.0;
    }
}

class B extends Marks {
    double s1, s2, s3, s4;

    public B(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    double getPercentage() {
        double total = s1 + s2 + s3 + s4;
        return (total * 100) / 400.0;
    }
}