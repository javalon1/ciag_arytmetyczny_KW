package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz liczbe wyrazow do wygenerowania");
        int n = scanner.nextInt();
        System.out.println("wpisz pierwszy wyraz ciagu");
        int a = scanner.nextInt();
        System.out.println("wpisz przyrost");
        int d = scanner.nextInt();

        for (int i = 0; i <= n ; i++) {
            System.out.println(a + (i-1) *d);
        }

    }
}
