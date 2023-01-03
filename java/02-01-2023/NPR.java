package com.waris;
import java.util.Scanner;

// write a program to find out NPR!

public class NPR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number for n: ");
        int n = in.nextInt();
        System.out.print("Enter the number for r: ");
        int r = in.nextInt();

        int nFact = fact(n);
        int nmrFact = fact(n-r);

        int NPR = nFact / nmrFact;
        System.out.println("The NPR of "+n + "P"+  r+" is : "  +NPR);

    }   static int fact(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            count *= i;
        }
        return count;
    }
}
