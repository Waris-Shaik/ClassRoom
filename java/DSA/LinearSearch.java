package com.waris.DSA;

public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {2,4,6,8,11,12,14,20,36,48};
        int target = 14;
        int ans = linearSearch(arr,target);
        System.out.println(ans);

    } public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i; // if target found it gives index number
            }
        }

            return -1; // if not found gives -1
    }
}
