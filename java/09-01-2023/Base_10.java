package com.waris;

import java.util.Scanner;
public class Base_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// program to print the number as same as you have given n user input

        System.out.print("Enter any medium Number: ");
        int n = in.nextInt();
        int ans = same_Number(n);
        System.out.println(ans); // here we are printing ans not directly n you can observe...!
        System.out.println("Done");



    } static int same_Number(int num){
        int ans = 0;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            ans += rem * (Math.pow(10, count++));
        }
        return ans;
    }
}
















