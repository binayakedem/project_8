package com.abstraction_exercise.question_4;

public abstract class ConstructorPrint {
    ConstructorPrint() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void non_method() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends ConstructorPrint {
    @Override
    void a_method() {
        System.out.println("his is abstract method");
    }
}
