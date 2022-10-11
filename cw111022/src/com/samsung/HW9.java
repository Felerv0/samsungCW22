package com.samsung;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mn = 10;
        while (n != 0) {
            if (n % 10 < mn && n % 10 != 0)
                mn = n % 10;
            n /= 10;
        }
        System.out.println(mn);
    }
}
