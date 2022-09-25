package com.company;

public class Addition implements ICalculate{


    @Override
    public double calculate(double leftNumber, double rightNumber) {
        return leftNumber+rightNumber;
    }
}
