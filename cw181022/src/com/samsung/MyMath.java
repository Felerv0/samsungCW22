package com.samsung;

public class MyMath {
    public static int min(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int mn = d;
        for (int i : arr) {
            if (i < mn)
                mn = i;
        }
        return mn;
    }
}
