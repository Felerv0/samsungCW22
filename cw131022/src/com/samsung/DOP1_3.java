package com.samsung;

import java.util.Scanner;

public class DOP1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i * (n + 1) + 1 + " ");
        }
    }
}
