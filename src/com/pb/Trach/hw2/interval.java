package com.pb.Trach.hw2;

import sun.font.TrueTypeFont;

import java.text.MessageFormat;
import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner learn = new Scanner(System.in);
        int x= learn.nextInt();
        String number = "10" + x + " : ";
        if (x>= 0 && x<= 14) {
            System.out.println(number + "[0-14]");
        } else if (x >= 15 && x<= 35 )  {
            System.out.println(number + "[15-35]");
        } else if (x >= 36 && x<= 50 )  {
            System.out.println(number + "[36-50]");
        } else if (x >= 51 && x<= 100 ) {
            System.out.println(number + "[51-100]");
        } else {
            System.out.println("помилка");
        }
        }
    }

