package com.samsung;

public class NumberDigits {
    public static int sumOfDigits(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static int sumOfSeven(int a, int b) {
        int s = 0;
        for (int i = a; i <= b; i++) {
            if (9 < i && i < 100 & i % 7 == 0)
                s += sumOfDigits(i);
        }
        return s;
    }

    public static int sumOfThirteen(int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (sumOfDigits(i) % 13 == 0) s++;
        }
        return s;
    }

    public static void binFraction(double x, int n) {
        for (int i = 0; i < n; i++) {
            x *= 2;
            System.out.print((int) x);
            x = x - (int) x;
        }
    }
}