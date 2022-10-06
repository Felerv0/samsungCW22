package com.samsung;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c)
                    System.out.print(c + " " + b + " " + a);
                else
                    System.out.print(b + " " + c + " " + a);
            } else
                System.out.print(b + " " + a + " " + c);
        } else {
            if (b > c) {
                if (a > c)
                    System.out.print(c + " " + a + " " + b);
                else
                    System.out.print(a + " " + c + " " + b);
            }
            else
                System.out.print(a + " " + b + " " + c);
        }
    }
}
