package com.abstraction_exercise.question_1;

//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
public class ChildExecutor {
    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        SecondChild secondChild = new SecondChild();

//        first child is calling using the first child object
        firstChild.message();

//        second child is calling using the second child objece
        secondChild.message();

    }
}
