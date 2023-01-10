package com.waris;


import  java.util.*;
public class Prime_Checking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//write  a program that takes n input from user. checks and prints it is prime or not

        System.out.print("Enter a Number to check it is prime or not: ");
        int num = in.nextInt();
        int c = 2;
        int count = 0;

            while(c*c <= num){

                if(num%c == 0){
                    count++;
                }
                c++;

            }

            if(count == 0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
    }
}
