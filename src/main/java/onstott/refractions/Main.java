package onstott.refractions;

import onstott.refractions.util.Refraction;
import onstott.refractions.util.RefractionConverter;
import onstott.refractions.util.RefractionInputValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Refraction Converter\n");
        Refraction refraction = readRefraction();
        if (refraction == null) {
            return;
        }

        String plusOrMinus = refraction.isMinusCylinderNotation() ? "minus" : "plus";
        System.out.println("You entered a " + plusOrMinus + "-cylinder notation: " + refraction);

        RefractionConverter converter = new RefractionConverter();
        String oppositeNotation = refraction.isMinusCylinderNotation() ? "plus" : "minus";
        System.out.println("The " + oppositeNotation + "-cylinder notation is: " + converter.convert(refraction));
    }

    /** @return the parsed {@link Refraction}, or null if it couldn't be read */
    private static Refraction readRefraction() {
        System.out.println("Enter a refraction:");
        Scanner scanner = new Scanner(System.in);
        try {
            String line = scanner.nextLine();
            RefractionInputValidator validator = new RefractionInputValidator();
            return validator.parseLine(line);
        } catch (RuntimeException e) {
            System.out.println("Error parsing the refraction: " + e.getMessage());
            return null;
        }
    }

}
