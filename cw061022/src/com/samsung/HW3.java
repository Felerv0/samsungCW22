package com.samsung;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " TORT");
        if ((4 < n % 100 && n % 100 < 21) || 4 < n % 10 || n % 10 == 0)
            System.out.print("OV");
        else if (1 < n % 10 && n % 10 < 5)
            System.out.print("A");
    }
}
