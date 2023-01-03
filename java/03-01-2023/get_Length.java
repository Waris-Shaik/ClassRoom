package com.waris;
import java.util.Scanner;
//import java.util.*;



// write a program that returns the given n user number length!





public class get_Length {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the medium digits number: ");
        int num = in.nextInt();
        int getLength = getLen(num);
        System.out.println("The Length of given number " + num +" is: "+ getLength);



    } // 1st method

    static int getLength(int num){

        int count = 0;
        while(num > 0){

            num /= 10;
            count ++;
        }
        return count;
    } // 2nd method

    static int getLen(int num){
        // here we are using Integer.toString() to convert integer so that
        // we can get String length

        String len = Integer.toString(num);
        return len.length();
    }
}



