package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator operation = new Calculator(5.0,6.0);
        double result = operation.calculate(new Addition());

        System.out.println(result);

    }
}
