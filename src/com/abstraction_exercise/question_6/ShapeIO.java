package com.abstraction_exercise.question_6;

import java.util.Scanner;

public class ShapeIO {
    Scanner sc = new Scanner(System.in);

    public void inputRectangle(Rectangle rectangle) {
        double len, bre, area;
        System.out.print("Enter the length of the rectangle:");
        len = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        bre = sc.nextDouble();
        display(rectangle.rectangleArea(len, bre));
    }

    public void inputCircle(Circle circle) {
        double r, area;
        System.out.print("Enter the radius of the Circle:");
        r = sc.nextDouble();
        display(circle.circleArea(r));

    }

    public void inputSquare(Square square) {
        double side, area;
        System.out.print("Enter the side  of the Square:");
        side = sc.nextDouble();
        display(square.squareArea(side));
    }

    void display(double area) {
        System.out.println("Area is:"+area);
    }
}
