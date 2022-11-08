package com.samsung;

import com.samsung.model.Pet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество домашних животных:");
        String name, owner, type;
        int n = sc.nextInt();
        Pet[] arr = new Pet[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя: ");
            name = sc.next();
            System.out.println("Введите имя владельца: ");
            owner = sc.next();
            System.out.println("Введите тип животного: ");
            type = sc.next();
            arr[i] = new Pet(name, owner, type);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Домашнее животное №" + (i + 1));
            System.out.println(arr[i]);
            System.out.println("-----------------------------------");
        }
    }
}
