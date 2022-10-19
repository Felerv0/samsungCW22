package com.samsung;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ind = 0, t, d;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                t = arr[ind];
                arr[ind] = arr[i];
                for (int j = ind + 1; j < i + 1; j++) {
                    d = arr[j];
                    arr[j] = t;
                    t = d;
                }
                ind++;
            }
        }
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
