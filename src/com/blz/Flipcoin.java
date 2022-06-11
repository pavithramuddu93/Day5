package com.blz;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flipCoinTimes = scanner.nextInt();
        System.out.println("coin flip times =" + flipCoinTimes);

        Random random = new Random();
        System.out.println(random);
        for (int i = 1; i <= flipCoinTimes; i++) {
            int x = random.nextInt(2);
            if (x == 0) {
                System.out.println("The flipped result Tail");
            } else {
                System.out.println("The flipped result Head");
            }
        }
    }
}

