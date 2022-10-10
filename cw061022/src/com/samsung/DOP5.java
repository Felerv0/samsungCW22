package com.samsung;

import java.util.Scanner;

public class DOP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

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
        System.out.println(a + " " + b + " " + c);
    }
}
