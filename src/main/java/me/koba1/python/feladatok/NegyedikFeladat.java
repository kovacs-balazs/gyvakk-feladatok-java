package me.koba1.python.feladatok;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NegyedikFeladat implements Feladat {
    @Override
    public int getNumber() {
        return 4;
    }

    @Override
    public void run() {
        System.out.println("Szöveg >");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            String input = scanner.nextLine().strip().toLowerCase();

            Map<String, Integer> chars = new HashMap<>();
            for (String s : input.split("")) {
                chars.put(s, chars.getOrDefault(s, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : chars.entrySet()) {
                System.out.println(entry.getKey() + " előfordulása: " + entry.getValue());
            }
        }
    }
}
