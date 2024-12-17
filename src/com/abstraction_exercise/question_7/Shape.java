package com.abstraction_exercise.question_7;

public abstract class Shape {
    abstract double rectangleArea(double len, double bre);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Rectangle extends Shape{

    @Override
    double rectangleArea(double len, double bre) {
        return len*bre;
    }

    @Override
    double squareArea(double side) {
        return 0;
    }

    @Override
    double circleArea(double radius) {
        return 0;
    }
}

class Circle extends Shape{
    @Override
    double rectangleArea(double len, double bre) {
        return 0;
    }

    @Override
    double squareArea(double side) {
        return 0;
    }

    @Override
    double circleArea(double radius) {
        return Math.PI*radius*radius;
    }
}

class Square extends Shape{
    @Override
    double rectangleArea(double len, double bre) {
        return 0;
    }

    @Override
    double squareArea(double side) {
        return side*side;
    }

    @Override
    double circleArea(double radius) {
        return 0;
    }
}