package com.example.java;

import utilities.mathHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main calc=new Main();
        try {
            calc.calculate();
        }catch (NumberFormatException e){
            System.out.println("invalid data type");
        }

    }

    protected void calculate() {
        System.out.println("NOTE That press 'ENTER' KEY after any input data");
        inputHelper input = new inputHelper();
        String number1 = input.getInput("enter number1");
        String op = input.getInput("enter the operation( + , - , / , * )");
        String number2 = input.getInput("enter number2");


        double result = 0;
        if (op.equalsIgnoreCase("+")) {
            result = mathHelper.add(number1, number2);
        } else if (op.equalsIgnoreCase("-")) {
            result = mathHelper.subtract(number1, number2);
        } else if (op.equalsIgnoreCase("*")) {
            result = mathHelper.multiplication(number1, number2);
        } else if (op.equalsIgnoreCase("/")) {
            result = mathHelper.dividing(number1, number2);
        } else {
            System.out.println("the symbol you Enter don`t match any operation");
        }

        System.out.println("the result is: " + result);

    }
// the method getInput is enough but the inner class just for practice
        public static class inputHelper {
            private String getInput(String prompt) {

                System.out.println(prompt);
                Scanner scanner = new Scanner(System.in);
                return scanner.next();
            }
        }
    }



