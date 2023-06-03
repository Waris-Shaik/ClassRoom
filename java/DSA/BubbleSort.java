package com.waris.DSA;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        bubbleSort(arr, "hii");
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length -1; i++){
            for(int j=0; j<arr.length -i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]  + " ");
        }
    }
    public static void bubbleSort(int[] arr, String msg){
        msg = "here we are using time complexity";

        boolean swapped;

        // outer loop
        for(int i=0; i<arr.length; i++){
            swapped = false;

            // inner loop
            for(int j=1; j<arr.length -i; j++){
                // when condition met swap should be done
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if array is being sorted at first we don't want to loop until n-1 simply break it.

            if(!swapped){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
