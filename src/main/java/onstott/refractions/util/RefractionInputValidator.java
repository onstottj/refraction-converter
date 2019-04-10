package onstott.refractions.util;

/* Class which converts user input to numeric values, if possible */
public class RefractionInputValidator {

    public Refraction parseLine(String line) {
        if (line.length() == 0) {
            throw new IllegalArgumentException("Please enter a refraction value, like \"+0.50 -3.25 x070\"");
        }
        // Split by spaces but ignore multiple spaces; see https://stackoverflow.com/a/13081545/132374
        String[] pieces = line.trim().split("\\s+");
        if (pieces.length != 3) {
            throw new IllegalArgumentException("Please enter a refraction value with sphere power, cylinder power, and axis");
        }
        return new Refraction(parseSpherePower(pieces[0]), parseCylinderPower(pieces[1]), parseAxis(pieces[2]));
    }

    double parseSpherePower(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a value for Sphere power");
        }
        double spherePower = Double.parseDouble(input);
        if (spherePower < -25 || spherePower > 25) {
            throw new NumberFormatException("Sphere power must be in the range of -25 to 25");
        }
        return spherePower;
    }

    double parseCylinderPower(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a value for Cylinder power");
        }
        double cylinderPower = Double.parseDouble(input);
        if (cylinderPower < -15 || cylinderPower > 15) {
            throw new NumberFormatException("Cylinder power must be in the range of -15 to 15");
        }
        return cylinderPower;
    }

    int parseAxis(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a value for Axis");
        }
        if (!input.toLowerCase().startsWith("x")) {
            throw new IllegalArgumentException("Axis must begin with an 'x'");
        }
        return Integer.parseInt(input.substring(1));
    }

    /** Updates an Axis value so that it is in the correct range */
    int standardizeAxis(int input) {
        int correctedValue = input;
        while (correctedValue < 1) {
            correctedValue += 180;
        }
        while (correctedValue > 180) {
            correctedValue -= 180;
        }
        return correctedValue;
    }

}
