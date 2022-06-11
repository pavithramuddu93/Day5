package com.blz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
