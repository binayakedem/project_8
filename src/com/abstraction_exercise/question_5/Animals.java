package com.abstraction_exercise.question_5;

public abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {

    }
}

class Dogs extends Animals {
    @Override
    void dogs() {
        System.out.println("Dog barks");
    }

    @Override
    void cats() {

    }
}