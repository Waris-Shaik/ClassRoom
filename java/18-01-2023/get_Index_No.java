package com.waris;

import java.util.Scanner;

public class get_Index_No {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter your Name: ");
        String name = in.nextLine();
        System.out.print("Enter a single character u want to get the index of that: ");
        char ch = in.next().trim().charAt(0);
        int store_Index_Position = 0;
        System.out.print(in.nextLine());


        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == ch){
                store_Index_Position = i;
            }
        }

        int show_Index_Position = store_Index_Position;
        System.out.println(show_Index_Position);


    }

}
