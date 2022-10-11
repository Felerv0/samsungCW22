package com.samsung;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), length = 0;
        while (n != 0) {
            n /= 10;
            length++;
        }
        System.out.println(length);
    }
}
