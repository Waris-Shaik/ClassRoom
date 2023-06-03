package com.waris.DSA;

import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.print("Enter any 3 digits number to check it is Armstrong or not : ");
        num = in.nextInt();
        System.out.println("The ans is : " + isArmStrong(num));

        // loop that gives 3 digits ArmStrong Numbers       eg:-    153 370 371 407
//        for(int i=100; i<1000; i++){
//            if(isArmStrong(i)){
//                System.out.print(i + " ");
//            }
//        }



    }public static boolean isArmStrong(int num){
        int originalNum = num;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            num = num / 10;
        }
        return sum == originalNum;
    }
}
