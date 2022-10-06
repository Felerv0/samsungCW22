package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class DOP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(y < 2 - x * x && (y > x || y > 0) ? "YES": "NO");
    }
}