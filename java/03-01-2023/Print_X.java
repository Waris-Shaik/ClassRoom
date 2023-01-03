package com.waris;

public class Print_X {
    public static void main(String[] args) {


        pattern1(5);


    } static void pattern1(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i == j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    } static void pattern2(int n){


        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                if(i+j == n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }

    static void pattern3(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == j || i+j == n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


}



// to approach and print X shape pattern
/*1) first print cross one line starts from left to right




 * 2) then print another cross one line this time should start from right to left
* 3) then combine both and print it u will get exact shape u want*/