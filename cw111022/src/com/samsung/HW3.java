package com.samsung;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        while (9 < n && n < 100) {
            s += n % 10 + n / 10;
            n = sc.nextInt();
        }
        System.out.println(s);
    }
}