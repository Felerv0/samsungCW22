package com.samsung;

import java.util.Scanner;

public class DOP2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt() - 1, b = sc.nextInt() - 1, c = sc.nextInt() - 1, d = sc.nextInt() - 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        change(arr, a, b);
        change(arr, c, d);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void change(int[] arr, int a, int b) {
        int t;
        for (int i = 0; i < (b - a + 1) / 2; i++) {
            t = arr[a + i];
            arr[a + i] = arr[b - i];
            arr[b - i] = t;
        }
    }
}
