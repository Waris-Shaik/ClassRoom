package com.waris;

import java.util.*;
public class SpanArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int differenceBetweenis = spanArray(arr);
        System.out.println("The difference between max and min is: " + differenceBetweenis);


    }static int spanArray(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int span = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The maximumElement in an array is: "+ max);
        System.out.println("The minimumElement in an array is: " + min);
        span = max - min;
        return span;
    }
}
