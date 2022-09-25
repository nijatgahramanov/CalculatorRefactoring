package com.company;

public class Calculator {
    private double leftNumber;
    private double rightNumber;

    public Calculator(double leftNumber, double rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public double calculate(ICalculate operation) {
       double result =  operation.calculate(this.leftNumber, this.rightNumber);
        return result;
    }
}
