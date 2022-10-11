package com.samsung;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        do {
            n = sc.nextInt();
            count++;
        } while (n >= 0);
        System.out.println(count);
    }
}
