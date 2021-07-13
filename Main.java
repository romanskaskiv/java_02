package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//
class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));


    }
    public static boolean isPalindrome(int x){
        String strX = Integer.toString(x);
        String revX = "";
        for (int i = strX.length() - 1; i >= 0; i--) {
            revX+=strX.charAt(i);
        }
        return strX.equals(revX);
    }

}


