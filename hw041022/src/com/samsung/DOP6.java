package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class DOP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(x * x + y * y < 1 && (y < x || y > -x) ? "YES": "NO");
    }
}