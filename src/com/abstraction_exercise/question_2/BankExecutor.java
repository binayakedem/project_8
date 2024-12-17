package com.abstraction_exercise.question_2;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.
public class BankExecutor {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

//        displaying information
        System.out.println("Balance of bank A:" + bankA.getBalance());
        System.out.println("Balance of bank B:" + bankB.getBalance());
        System.out.println("Balance of bank C:" + bankC.getBalance());
    }
}
