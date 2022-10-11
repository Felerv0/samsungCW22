package com.samsung;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        if (n % 2 == 0 && n != 2) // ускорение, чтобы просто так не перебирать чётные числа
            n += 1;
        while (true) {
            int i = 3;
            boolean a = false;
            while (i < n / 2 + 1) {
                if (n % i == 0) {
                    a = true;
                    break;
                }
                i++;
            }
            if (a)
                n += 2; // чтобы не перебирать чётные числа
            else
                break;
        }
        System.out.println(n);
    }
}
