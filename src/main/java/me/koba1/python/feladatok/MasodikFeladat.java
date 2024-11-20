package me.koba1.python.feladatok;

import java.util.*;
import java.util.stream.Collectors;

public class MasodikFeladat implements Feladat {
    @Override
    public int getNumber() {
        return 2;
    }

    @Override
    public void run() {
        System.out.println("Számok >");
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        if(sc.hasNextLine()) {
            String input = sc.nextLine().strip();
            Arrays.stream(input.split(", ")).map(Integer::parseInt).forEach(k -> map.put(k, null));
            System.out.println(String.join(", ", map.keySet().stream().map(i -> i + "").toList()));
        }
    }
}
