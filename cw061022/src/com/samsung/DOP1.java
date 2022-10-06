package com.samsung;

import java.util.Scanner;

public class DOP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print(30);
                break;
            case 2:
                System.out.print(28);
                break;
            default:
                System.out.print(0);
        }
    }
}
