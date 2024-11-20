package me.koba1.python.feladatok;

import java.util.Random;
import java.util.Scanner;

public class HatodikFeladat implements Feladat{
    @Override
    public int getNumber() {
        return 6;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kockák >");
        if(!scanner.hasNextInt()) return;
        int kockak = scanner.nextInt();

        System.out.println("Oldalak >");
        if(!scanner.hasNextInt()) return;
        int oldalak = scanner.nextInt();

        int amount = 0;
        Random rand = new Random();
        for (int i = 0; i < kockak; i++) {
            int ra = rand.nextInt(1, oldalak + 1);
            System.out.println((i + 1) + ". kockával: " + ra);
            amount += ra;
        }

        System.out.println("Dobott értékek összege: " + amount);
    }
}
