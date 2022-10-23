package com.samsung;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n * m; i++) {
            arr[i / m][i % m] = sc.nextInt();
        }
        System.out.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
