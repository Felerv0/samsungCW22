package com.samsung;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println(100 <= a && a <= 999 && a % 5 == 0);
    }
}
