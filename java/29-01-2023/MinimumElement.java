package com.waris;
import java.util.*;

// write a program that returns minimum element in an array!

public class MinimumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int minimumElement = min(arr);
        System.out.println("The minimum element is: " + minimumElement);


    } static int min(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}


/*

6   the minimum element in this array is 2
10
2
4
8
16
21

*/