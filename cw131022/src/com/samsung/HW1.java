package com.samsung;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ind = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                ind = i + 1;
                break;
            }
        }
        System.out.println(ind == 0 ? "NO": ind);
    }
}
