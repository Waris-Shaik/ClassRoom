package com.waris;

import java.util.*;

public class Case_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // a program it checks a character is upper case or lowercase!

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }

    }
}
