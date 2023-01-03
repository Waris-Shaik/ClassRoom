package com.waris;
import java.util.Scanner;
//import java.util.*;

// write a program that counts the particular number in given n user number!
// Digits Frequency Program!



public class DigitFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the one medium digits number: ");
        int num = in.nextInt(); // 788989, 46474944
        System.out.print("Enter the one digit you wanna get frequency of that number: ");
        int digit = in.nextInt(); // 8 (8 appears 3 times)  4 (4 appears 5);
        int ans = getDigitFrequency(num,digit);
        System.out.println(ans);


    } public static int getDigitFrequency(int  num, int digit){
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;

            if(digit == rem){
                count++;
            }
        }
        return count;
    }
}
