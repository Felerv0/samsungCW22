package com.samsung;

import java.util.Scanner;

public class DOP2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (x != arr[i + 1]) {
                x = arr[i + 1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
