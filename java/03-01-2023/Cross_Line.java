package com.waris;

public class Cross_Line {
    public static void main(String[] args) {

        pattern3(5);



    } //1st method

    static void pattern1(int n){

        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<i; j++){
                System.out.print("\t");
            }

            //stars

            for(int k=1; k<=1; k++){
                System.out.print("*\t");
            }

            System.out.println();
        }
    }

    //2nd method

    static void pattern2(int n){

        //as per sir instructions

        int spaces = n%5;
        int stars = 1;

        for(int i=1; i<=n; i++){    //loop will run n times

            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }

            //stars

            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }

            spaces++;
            System.out.println();


        }
    }

    //3rd method

    static void pattern3(int n){

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
    }
}
