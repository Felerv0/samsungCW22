package com.samsung;

import java.util.Scanner;

public class DOP2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            if (i > 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
