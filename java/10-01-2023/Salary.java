package com.waris;

import java.util.*;
public class Salary {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

//write a program that takes user salary as input and check it.
// if it is greater than 10000 salary should be incremented with 2000
// if it is less than 10000 it should be incremented with 1000

    System.out.print("Enter your Salary: ");
    int salary = in.nextInt();
    System.out.println("Your Salary is: " + salary);


    if(salary > 10000){
        salary = salary + 2000;
        System.out.println("Adding Bonus: 2000");
    }else{
        salary = salary + 1000;
        System.out.println("Adding Bonus: 1000");

    }

    System.out.println("The Total Salary is: "+ salary);
    }
}
