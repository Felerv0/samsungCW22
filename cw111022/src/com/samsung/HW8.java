package com.samsung;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean t = true;
        while (n != 0) {
            if (n % 10 % 2 == 1) {
                System.out.println(n % 10);
                t = false;
                break;
            }
            n /= 10;
        }
        if (t)
            System.out.println("NO");
    }
}
