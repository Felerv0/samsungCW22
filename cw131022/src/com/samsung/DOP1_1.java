package com.samsung;

import java.util.Scanner;

public class DOP1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            System.out.print(n % 2);
            n /= 2;
        }
    }
}
