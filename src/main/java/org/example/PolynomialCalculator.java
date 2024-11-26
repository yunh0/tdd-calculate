package org.example;

public class PolynomialCalculator {

    public static int run(String expr){
        String[] exprArr = expr.split(" \\+ ");

        int num1 = Integer.parseInt(exprArr[0]);
        int num2 = Integer.parseInt(exprArr[1]);

        return num1 + num2;
    }
}
