package com.waris;

import java.util.Scanner;
//import java.util.*;

// write a program that should be written in function. it should be printed and should be done return!

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number to reverse it: ");
        int num = in.nextInt();
        int ans = reverseNumber(num);
        System.out.println("the reversing is done ");
        System.out.println("here is the ans: " + ans);





    }
    // 1st method which returns ans
    static int reverseNumber(int num){
        int ans = 0;

        while(num > 0) {

            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;

        }
        return ans;

    }
    // 2nd method which prints the number
    static void reverse_Number(int n){

        while(n > 0){
            int rem = n % 10;
            n /= 10;
            System.out.print(rem);
        }
    }
}
