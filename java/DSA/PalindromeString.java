package com.waris.DSA;

public class PalindromeString {
    public static void main(String[] args) {

        String name = "waris";
        String name1 = "";
        System.out.println(isPalindrome(name, name1));

    }public static  boolean isPalindrome(String org, String rev){
        for(int i=0; i<org.length(); i++){
//            rev = rev + org.charAt(org.length() -1 -i);
            rev = org.charAt(i) + rev;
        }

        return  rev.equals(org);
    }
}
