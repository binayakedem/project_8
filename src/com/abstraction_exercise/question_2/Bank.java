package com.abstraction_exercise.question_2;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.
public abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    @Override
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    int getBalance() {
        return 200;
    }
}
