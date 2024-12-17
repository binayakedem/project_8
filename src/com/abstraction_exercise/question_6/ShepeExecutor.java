package com.abstraction_exercise.question_6;

public class ShepeExecutor {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        ShapeIO shapeIO = new ShapeIO();
        shapeIO.inputRectangle(rectangle);

        shapeIO.inputSquare(square);

        shapeIO.inputCircle(circle);

    }
}
