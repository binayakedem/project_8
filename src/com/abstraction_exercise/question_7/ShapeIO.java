package com.abstraction_exercise.question_7;

import java.util.Scanner;

public class ShapeIO {
    Scanner sc = new Scanner(System.in);
    void inputRectangle(Rectangle [] rectangles){
        for(Rectangle r:rectangles){
            inputRectangle(r);
        }
    }
    void inputRectangle(Rectangle rectangle) {
        double len, bre;
        System.out.print("Enter the length of the rectangle:");
        len = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        bre = sc.nextDouble();
        display(rectangle.rectangleArea(len, bre));
    }
    public  void inputCircle(Circle [] circles){
        for (Circle c:circles){
            inputCircle(c);
        }
    }
    public void inputCircle(Circle circle) {
        double r;
        System.out.print("Enter the radius of the Circle:");
        r = sc.nextDouble();
        display(circle.circleArea(r));

    }
   public void inputSquare(Square[] square){
        for (Square s:square){
            inputSquare(s);
        }
   }
    void inputSquare(Square square) {
        double side;
        System.out.print("Enter the side  of the Square:");
        side = sc.nextDouble();
        display(square.squareArea(side));
    }

    void display(double area) {
        System.out.println("Area is:"+area);
    }
}
