package com.samsung;

import java.util.Scanner;

public class DOP1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), f = 1;
        for (int i = 1; i < n + 1; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
