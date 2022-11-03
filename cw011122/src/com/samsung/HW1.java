package com.samsung;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(a == (byte)a ? "YES" : "NO");
        System.out.println(a == (short)a ? "YES" : "NO");
    }
}
