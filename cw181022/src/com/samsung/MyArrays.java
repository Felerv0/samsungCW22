package com.samsung;

public class MyArrays {
    public static double avgOf4Digit(int[] arr) {
        double s = 0;
        int cnt = 0;
        for (int i : arr) {
            if (999 < i && i < 10000) {
                s += i;
                cnt++;
            }
        }
        if (cnt > 0)
            return s / cnt;
        else
            return -1.0d;
    }

    public static int[] minToBegin(int[] arr) {
        int ind = 0, mn = 1000000000, t = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
                ind = i;
            }
        }
        arr[0] = arr[ind];
        for (int i = 1; i < ind + 1; i++) {
            int d = arr[i];
            arr[i] = t;
            t = d;
        }
        return arr;
    }
}
