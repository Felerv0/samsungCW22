package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class DOP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(x > 0 && y < 1 && (x * x + y * y < 1 || y > x - 1) ? "YES": "NO");
    }
}