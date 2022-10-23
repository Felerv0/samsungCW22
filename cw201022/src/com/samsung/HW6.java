package com.samsung;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = n, y = n, i = 0, move_index = 0, max_moves = 1, m_without_rotates = 0;
        boolean second_rotate = false;
        int[][] arr = new int[2 * n + 1][2 * n + 1], moves = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
        while (i < (2 * n + 1) * (2 * n + 1)) {
            arr[y][x] = i;
            if (m_without_rotates == max_moves) {
                m_without_rotates = 0;
                move_index++;
                if (move_index > 3)
                    move_index = 0;
                if (!second_rotate)
                    second_rotate = true;
                else {
                    second_rotate = false;
                    max_moves++;
                }
            }
            x += moves[move_index][0];
            y += moves[move_index][1];
            m_without_rotates++;
            i++;
        }
        for (int j = 0; j < 2 * n + 1; j++) {
            for (int k = 0; k < 2 * n + 1; k++) {
                System.out.print(format_3_symbols(arr[j][k]));
            }
            System.out.println();
        }
    }
    public static String format_3_symbols(int a) {
        int cnt = 0, b = a != 0 ? a : 1;
        while (b != 0) {
            b /= 10;
            cnt++;
        }
        if (cnt == 1)
            return "  " + a;
        else if (cnt == 2)
            return " " + a;
        return a + "";
    }
}
