package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0, cnt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                cnt++;
                s += arr[i];
            }
        }
        if (cnt > 0)
            System.out.printf(Locale.US, "%.2f", (double) s / cnt);
        else
            System.out.println("NO");
    }
}
