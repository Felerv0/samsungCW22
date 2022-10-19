package com.samsung;

import java.util.Scanner;

public class DOP1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = (n + 1) * n / 2;
        for (int i = 0; i < n - 1; i++) {
            s -= sc.nextInt();
        }
        System.out.print(s);
    }
}
