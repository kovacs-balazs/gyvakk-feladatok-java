package me.koba1.python.feladatok;

import java.util.Scanner;

public class OtodikFeladat implements Feladat{
    @Override
    public int getNumber() {
        return 5;
    }

    @Override
    public void run() {
        System.out.println("Szám >");
        Scanner scn = new Scanner(System.in);
        if(scn.hasNextInt()) {
            int input = scn.nextInt();

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int number = i * j;
                    if (number < 10) {
                        System.out.print("  " + number + " ");
                        continue;
                    }
                    if (number < 100) {
                        System.out.print(" " + number + " ");
                        continue;
                    }
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            System.out.println();
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    int number = i * j * input;
                    System.out.print(number + " ");
                }
                System.out.println();
            }
        }
    }
}
