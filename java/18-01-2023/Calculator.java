package com.waris;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {


            System.out.print("Enter a Number: ");
            int num1 = in.nextInt();
            System.out.print("Enter a Operator: ");
            char op = in.next().trim().charAt(0);
            System.out.print("Enter a Number: ");
            int num2 = in.nextInt();
            int res = 0;

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                if (op == '+') {
                    res = num1 + num2;
                } else if (op == '-') {
                    res = num1 - num2;
                } else if (op == '*') {
                    res = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        res = num1 / num2;
                    }
                } else if (op == '%') {
                    res = num1 % num2;
                }


            } else {
                System.out.println("Invalid Operator :(");
            }

            System.out.println();
            System.out.println("The result is: " + res);
            System.out.print("wanna exit (y/n): ");
            char ex = in.next().trim().charAt(0);
            System.out.println();


            if(ex == 'y'){
                System.out.println("we are jumping off.....");
                System.out.println("Success");
                break;
            }


        }

    }
}
