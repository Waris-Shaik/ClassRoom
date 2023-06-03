package com.waris.DSA;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input ;
        System.out.print("Enter your name : ");
        input = in.nextLine();
        StringBuilder sb = new StringBuilder(input);


        for(int i=0; i<sb.length()/2; i++) {

            int start = i;
            int end = sb.length() - 1 - i;

            char firstCharacter = sb.charAt(start);
            char lastCharacter = sb.charAt(end);

            sb.setCharAt(start, lastCharacter);
            sb.setCharAt(end, firstCharacter);

        }

        System.out.println("The ans is : " + sb);

    }
}
