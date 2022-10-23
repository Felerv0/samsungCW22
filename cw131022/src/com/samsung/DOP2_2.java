package com.samsung;

import java.util.Scanner;

public class DOP2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
