package com.samsung;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, cnt = 0, mx = 0, m = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == a) {
                    cnt++;
                }
            }
            if (cnt > mx) {
                mx = cnt;
                m = a;
            }
            cnt = 0;
        }
        System.out.println(m);
    }
}
