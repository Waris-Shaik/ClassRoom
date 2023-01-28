package com.waris;
import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int maximumElement = max(arr);
        System.out.println("The maximumElement is: " + maximumElement);
/*      int[] arr1 = {10,222,4,8,166,21};
        int maximumElement = max(arr1);
        System.out.println("The maximumElement is: " + maximumElement);
*/

    }static int max(int[] arr){
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
            return max;
    }
}
