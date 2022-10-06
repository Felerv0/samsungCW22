package com.samsung;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        System.out.println(a == -b || a == -c || a == -d || b == -c || b == -d || c == -d);
    }
}