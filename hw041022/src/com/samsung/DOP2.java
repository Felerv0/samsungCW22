package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class DOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(0 < y && y < 0.5 && y < Math.sin(x) && x > 0 && x < Math.PI ? "YES": "NO");
    }
}

