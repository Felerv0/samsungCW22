package com.samsung;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(!(-2 <= a && a <= 3) && !(6 <= a && a <= 9));
    }
}
