package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class DOP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(x * x + y * y < 1 || (0 < x && x < 1 && 0 < y && y < 1) ? "YES": "NO");
    }
}