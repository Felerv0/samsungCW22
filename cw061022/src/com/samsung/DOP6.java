package com.samsung;

import java.util.Scanner;

public class DOP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c)
            System.out.println("acute");
        else if (a + b > c && a + c > b && b + c > a) {
            int d;
            if (b < a) {
                d = a;
                a = b;
                b = d;
            }
            if (c < a) {
                d = c;
                c = b;
                b = a;
                a = d;
            }
            else if (c < b) {
                d = b;
                b = c;
                c = d;
            }
            if (a * a + b * b > c * c)
                System.out.println("obtuse");
            else if (a * a + b * b < c * c)
                System.out.println("acute");
            else
                System.out.println("right");
        }
        else
            System.out.println("impossible");
    }
}
