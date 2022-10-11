package com.samsung;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), count = 0;
        while (a >= b) {
            count++;
            a -= b;
        }
        System.out.printf("%d %d", count, a);
    }
}
