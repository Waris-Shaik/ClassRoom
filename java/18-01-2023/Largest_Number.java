package com.waris;

import java.util.*;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // find the largest number in range of two numbers:

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int max = 0;

        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }

        System.out.println(max);

        // find largest number in range of three numbers

        int Num1 = in.nextInt();
        int Num2 = in.nextInt();
        int Num3 = in.nextInt();
        int Max =  0;

        if(Num1>Num2 &&  Num1>Num3){
            Max = Num1;
        }else if(Num2>Num1 && Num2>Num3) {
            Max = Num2;
        }else if(Num3>Num1 &&  Num3>Num2){
            Max = Num3;
        }

        System.out.println(max);

/*
        if(a>b){
            max = a;
        }else {
            max = b;
        }

        if(c>max){
            max =c;
        }

        System.out.println(max);

        */







    }
}
