package com.samsung;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (0 <= n && n <= 9)
            System.out.println("DIGIT");
        else if (10 <= n && n <= 99)
            System.out.println("NUM");
        else
            System.out.println("OTHER");
    }
}
