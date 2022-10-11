package com.samsung;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        do {
            n = sc.nextInt();
            if (n > 10)
                s += n;
        } while (n % 5 != 0);
        System.out.println(s);
    }
}
