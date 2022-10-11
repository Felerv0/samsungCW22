package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if ((a > 0 && b >= 0) || (a == 0 && b > 0))
            System.out.println("any x");
        else if (a == 0 || (a < 0 && b <= 0))
            System.out.print("no such x");
        else if (a < 0) {
            System.out.printf(Locale.US, "%.1f<x<%.1f", (double) b / a, (double) -b / a);
        }
        else {
            System.out.printf(Locale.US, "x<%.1f or x>%.1f", (double) b / a, (double) -b / a);
        }
    }
}
