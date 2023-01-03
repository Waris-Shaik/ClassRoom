package com.waris;
import java.util.Scanner;

public class NPR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        int nFact = 1;
        for(int i=1; i<=n; i++){
            nFact = nFact * i;
        }

        int nmrFact = 1;
        for(int j=1; j<= n - r; j++){
            nmrFact = nmrFact * j;
        }

        int NPR = nFact / nmrFact;
        System.out.println(n + "P"+  r+" = "  +NPR);

    }
}
