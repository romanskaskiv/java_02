package com.company;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(a + " is a palindrome? -> " + isPalindrome(a));
        System.out.println(a + " with reversed digits? -> " + reverseDigits(a));
        System.out.println(x + " / " + y + " ? -> " + divideInts(x, y));
        System.out.println("Sqrt of " + b + " ? -> " + mySqrt(b));
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

    public static int divideInts(int x, int y) {
        int result = 0;
        var xIsNegative = x < 0;
        if (xIsNegative) {
            x = -x;
        }
        var yIsNegative = y < 0;
        if (yIsNegative) {
            y = -y;
        }
        while (x - y >= 0) {
            result += 1;
            x -= y;
        }

        if ((xIsNegative && !yIsNegative) || (!xIsNegative && yIsNegative)) {
            result = -result;
        }

        return result;
    }

    public static int mySqrt(int number) {
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return (int)sr;
    }

}
