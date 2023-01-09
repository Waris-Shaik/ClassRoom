package com.waris;


public class fibonacci_Pattern {
    public static void main(String[] args) {

        //fibonacci_Series(7); // fibonacci series
        fbnc_series_Pattern(5); // fibonacci_Series_Pattern

    } /*fibonacci series*/
    static void fibonacci_Series(int n){
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = num1 + num2;
            System.out.print(num1 + "\t");
            num1 = num2;
            num2 = sum;


        }
    } /*fibonacci_Series_Pattern*/

    static void fbnc_series_Pattern(int n){
        int num1 = 0;
        int num2 = 1;
        int sum =  0;


        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum = num1 + num2;
                System.out.print(num1 + "\t");
                num1 = num2;
                num2 = sum;
            }
            System.out.println();
        }
    }
}
