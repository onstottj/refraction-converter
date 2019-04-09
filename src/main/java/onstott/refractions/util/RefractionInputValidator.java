package onstott.refractions.util;

/* Class which converts user input to numeric values, if possible */
public class RefractionInputValidator {

    public double parseSpherePower(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a value for Sphere power");
        }
        double spherePower = Double.parseDouble(input);
        if (spherePower < -25 || spherePower > 25) {
            throw new NumberFormatException("Sphere power must be in the range of -25 to 25");
        }
        return spherePower;
    }

    public double parseCylinderPower(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a value for Cylinder power");
        }
        double cylinderPower = Double.parseDouble(input);
        if (cylinderPower < -15 || cylinderPower > 15) {
            throw new NumberFormatException("Cylinder power must be in the range of -15 to 15");
        }
        return cylinderPower;
    }

    public int parseAxis(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("Please enter a value for Axis");
        }
        if (!input.toLowerCase().startsWith("x")) {
            throw new IllegalArgumentException("Axis must begin with an 'x'");
        }
        return Integer.parseInt(input.substring(1));
    }

    /** Updates an Axis value so that it is in the correct range */
    public int standardizeAxis(int input) {
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
