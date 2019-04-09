package onstott.refractions.util;

public class RefractionConverter {

    private static RefractionInputValidator INPUT_VALIDATOR = new RefractionInputValidator();

    public Refraction convert(Refraction input) {
        double spherePower = input.getSpherePower() + input.getCylinderPower();
        double cylinderPower = -1 * input.getCylinderPower();
        int axis = convertAxis(input);
        return new Refraction(spherePower, cylinderPower, axis);
    }

    private int convertAxis(Refraction input) {
        int degreesToAdd = input.isMinusCylinderNotation() ? 90 : -90;
        return RefractionConverter.INPUT_VALIDATOR.standardizeAxis(input.getAxis() + degreesToAdd);
    }

}
