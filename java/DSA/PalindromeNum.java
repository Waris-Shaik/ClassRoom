package com.waris.DSA;

import java.util.*;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.print("Enter a number to check it is palindrome or not : ");
        num = in.nextInt();
        System.out.println("The ans is : " + isPalindrome(num));


        // loop that gives which numbers are palindrome in between 100 and 999
//        for(int i=100; i<1000; i++){
//            if(isPalindrome(i)){
//                System.out.print(i + " ");
//            }
//        }

    }public static boolean isPalindrome(int num){
        int originalNum = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev == originalNum;
    }
}
