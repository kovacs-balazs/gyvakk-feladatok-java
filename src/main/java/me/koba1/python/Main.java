package me.koba1.python;

import me.koba1.python.feladatok.*;
import org.apache.commons.cli.*;

public class Main {


    public static void main(String[] args) {
        Options options = new Options();

        Option input = new Option("f", "feladat", true, "Feladat sorszáma");
        input.setRequired(false);
        options.addOption(input);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }

        String feladatSorszama = cmd.getOptionValue("feladat") == null ? "1" : cmd.getOptionValue("feladat");
        try {
            int sorszam = Integer.parseInt(feladatSorszama);
            Feladat feladat = new ElsoFeladat();
            switch (sorszam) {
                case 2:
                    feladat = new MasodikFeladat();
                    break;
                case 3:
                    feladat = new HarmadikFeladat();
                    break;
                case 4:
                    feladat = new NegyedikFeladat();
                    break;
                case 5:
                    feladat = new OtodikFeladat();
                    break;
                case 6:
                    feladat = new HatodikFeladat();
                    break;
            }
            feladat.run();
        } catch (NumberFormatException e) {

        }
    }
}