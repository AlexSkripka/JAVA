package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        String number1, number2, number3;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        number1 = in.next();
        System.out.println("Enter your second number: ");
        number2 = in.next();
        System.out.println("Enter your third number: ");
        number3 = in.next();
        System.out.println("\n");
        System.out.println("Number 1: ");
        Check2(number1);
        System.out.println("Number 2: ");
        Check2(number2);
        System.out.println("Number 3: ");
        Check2(number3);
    }

    public static void Check2(String number) {
        if (Check1(number) == true) {
            double result = Double.parseDouble(number);
            if (result % 2 == 0) {
                System.out.println("Even number\n");
            } else {
                System.out.println("Not even number\n");
            }
        } else {
            System.out.println("Input data is not valid\n");
        }
    }

    public static boolean Check1(String number) {
        int tmp = 0, minus;
        char[] Numbers = number.toCharArray();

        if(Numbers[0] == '-')
        {
            minus = 1;
        }
        else
        {
            minus = 0;
        }

        for (int i = minus; i < Numbers.length; i++) {

            if (Character.isDigit(Numbers[i])) {
            } else {
                tmp++;
            }
        }
        if (tmp == 0) {
            return true;
        } else {
            return false;
        }
    }
}