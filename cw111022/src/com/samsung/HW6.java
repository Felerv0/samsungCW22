package com.samsung;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 26, n = sc.nextInt(), s = 0,  STEP = 2;
        while (i < n) {
            s += i;
            i += STEP;
        }
        System.out.println(s);
    }
}
