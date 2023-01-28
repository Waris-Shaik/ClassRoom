package com.waris;

public class FindElementinArray {
    public static void main(String[] args){

        int[] arr = {15,30,40,4,11,9};
        int target = 40;
        int findElement = findElement(arr,target);
        System.out.println(findElement);
    }static int findElement(int[] arr, int target){
        int indexPosition = 0;

        for(int i=0; i<arr.length; i++){
            int eachValue = arr[i];
            if(eachValue == target){
                indexPosition = i;
                return indexPosition;
            }
        }
                return -1;
    }
}
