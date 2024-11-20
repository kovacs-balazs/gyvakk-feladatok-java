package me.koba1.python.feladatok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElsoFeladat implements Feladat {
    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public void run() {
        System.out.println("Szám >");
        Scanner scn = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (scn.hasNextInt()) {
            int number = scn.nextInt();
            if (number == 0) {
                break;
            }

            numbers.add(number);
            System.out.println("Szám >");

        }

        System.out.println("Páros számok: " +
                String.join(", ", numbers.stream().filter(num -> num % 2 == 0).map(num -> num + "").toList())
        );

        System.out.println("Páratlan számok: " +
                String.join(", ", numbers.stream().filter(num -> num % 2 != 0).map(num -> num + "").toList())
        );
    }
}
