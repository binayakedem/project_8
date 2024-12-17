package com.abstraction_exercise.question_1;

public abstract class Parent {
    public int var;

    public void message() {
    }
}

class FirstChild extends Parent {
    @Override
    public void message() {
        System.out.println("This is first child");
    }
}

class SecondChild extends Parent {
    @Override
    public void message() {
        System.out.println("This is second child");

    }
}
