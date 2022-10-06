package com.samsung;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println((-3 <= a && a <= 5) || (9 <= a && a <= 15));
    }
}
