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
        System.out.println("Is number palindrome: " + isPalindrome(x));
        System.out.println("Reversed number: " + reverseDigits(x));


    }

    public static boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        String revX = "";
        for (int i = strX.length() - 1; i >= 0; i--) {
            revX += strX.charAt(i);
        }
        return strX.equals(revX);
    }

    public static int reverseDigits(int x) {
        var isNegative = x < 0;
        if (x < 0) {
            x *= -1;
        }
        int reversed = 0;
        int last;
        while (x > 0) {
            last = x % 10;
            reversed = reversed * 10 + last;
            x /= 10;
        }
        return isNegative ? reversed * -1 : reversed;
    }

}


