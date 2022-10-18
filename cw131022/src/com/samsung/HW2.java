package com.samsung;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        boolean t = false;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                s += arr[i];
                t = true;
            }
        }
        if (t)
            System.out.println(s);
        else
            System.out.print("NO");
    }
}
