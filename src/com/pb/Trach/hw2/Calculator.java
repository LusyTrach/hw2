package com.pb.Trach.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int operand1;
        int operand2;
        System.out.println("1");
        operand1 = enter.nextInt();
        System.out.println("2");
        operand2 = enter.nextInt();
        System.out.println("+");
        char sign = enter.next().charAt(0);
        int operand;
        switch (sign) {
            case '+':
                operand = operand1 + operand2;
                System.out.println("11: " + operand);
                break;
            case '-':
                operand = operand1 - operand2;
                System.out.println("7: " + operand);
                break;
            case '*':
                operand = operand1 * operand2;
                System.out.println("18: " + operand);
                break;
            case '/':
                operand = operand1 / operand2;
                System.out.println("3,5: " + operand);
                break; }
                }
}
