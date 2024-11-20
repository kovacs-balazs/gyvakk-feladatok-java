package me.koba1.python.feladatok;

import java.util.Arrays;
import java.util.Scanner;

public class HarmadikFeladat implements Feladat{
    @Override
    public int getNumber() {
        return 3;
    }

    @Override
    public void run() {
        System.out.println("Betűk >");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            String input = scanner.nextLine().strip();

            System.out.println(
                    String.join(", ", Arrays.stream(input.split("")).filter(s -> s.matches("[a-zA-Z]")).sorted().toList())
            );
        }
    }
}
