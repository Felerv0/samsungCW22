package com.samsung;

import java.util.Scanner;

public class DOP2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mx = arr[0];
        for (int i : arr) {
            if (i > mx)
                mx = i;
        }
        System.out.println(mx);
    }
}
