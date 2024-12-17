package com.abstraction_exercise.question_7;

public class ShepeExecutor {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();


        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        Square square4 = new Square();

        ShapeIO shapeIO = new ShapeIO();

        Circle[] circles = {circle1, circle2, circle3, circle4, circle5};
        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3, rectangle4};
        Square[] squares = {square1, square2, square3, square4};

        shapeIO.inputRectangle(rectangles);
        shapeIO.inputSquare(squares);
        shapeIO.inputCircle(circles);

    }
}
