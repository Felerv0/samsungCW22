package com.samsung;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        while (n != 0) {
            n /= 2;
            count++;
        }
        System.out.println(count);
    }
}
