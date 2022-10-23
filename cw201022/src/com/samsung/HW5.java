package com.samsung;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = i * m + j;
                }
            }
            else {
                for (int j = 0; j < m; j++) {
                    A[i][j] = m * (i + 1) - j - 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(format_3_symbols(A[i][j]));
            }
            System.out.println();
        }
    }
    public static String format_3_symbols(int a) {
        int cnt = 0, b = a != 0 ? a : 1;
        while (b != 0) {
            b /= 10;
            cnt++;
        }
        if (cnt == 1)
            return "  " + a;
        else if (cnt == 2)
            return " " + a;
        return a + "";
    }
}
