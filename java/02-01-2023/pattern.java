package com.waris;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        pattern1(5);

    }static int pattern(int n){
        int sp = n-1;
        int st = 1;

        for(int i=1; i<=n; i++){


            for(int j=1; j<=sp; j++){

                System.out.print("\t");
            }

            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }


            st++;
            System.out.println();
        }

        return n;
    }
    static int pattern1(int n){

        for(int i=1; i<=n; i++){

            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("\t");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }


        return n;
    }

}

