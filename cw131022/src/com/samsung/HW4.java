package com.samsung;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 4;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s;
            s += 3;
            System.out.print(arr[i] + " ");
        }
    }
}
