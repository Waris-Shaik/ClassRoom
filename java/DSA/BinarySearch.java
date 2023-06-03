package com.waris.DSA;

public class BinarySearch {
    public static void main(String[] args){

        // ascending order
        int[] arr = {2,4,6,8,11,12,14,20,36,48};
        int target = 48;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    } public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid; // if element found gives index number
            }
        }
        return -1; // if element not found gives -1
    }
}
