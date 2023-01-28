package com.waris;
import java.util.*;


public class SwapArrayElements {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = {1,2,3,4,5,6};
    swap(arr, 0 , 1);
    System.out.println(Arrays.toString(arr));



    } static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
