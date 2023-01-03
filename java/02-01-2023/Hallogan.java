package com.waris;

public class Hallogan {




        public static void main(String[] args) {


            pattern(7);

        } static void pattern(int n){

            int stars = n/2+1;
            int spaces = 1;

            for(int i=1; i<=n; i++){

                for(int j=1; j<=stars; j++){
                    System.out.print("*\t");
                }

                for(int k=1; k<=spaces; k++){
                    System.out.print("\t");
                }


                for(int j=1; j<=stars; j++){
                    System.out.print("*\t");
                }

                System.out.println();


                if(i<=n/2){

                    spaces+=2;
                    stars--;
                }else{
                    spaces-=2;
                    stars++;
                }
            }


            // System.out.println();
        }
    }



