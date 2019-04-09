package onstott.refractions.util;

import java.text.DecimalFormat;

/** Model that represents the refraction for an astigmatic eye */
public class Refraction {

    /** See https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html & https://stackoverflow.com/a/5243412/132374 */
    private static DecimalFormat sphereAndCylinderFormat = new DecimalFormat("+0.00;-0.00");
    private static DecimalFormat axisFormat = new DecimalFormat("x000");

    private double spherePower;
    private double cylinderPower;
    private int axis;

    public Refraction(double spherePower, double cylinderPower, int axis) {
        this.spherePower = spherePower;
        this.cylinderPower = cylinderPower;
        this.axis = axis;
    }

    public double getSpherePower() {
        return spherePower;
    }

    public double getCylinderPower() {
        return cylinderPower;
    }

    public int getAxis() {
        return axis;
    }

    @Override
    public String toString() {
        return sphereAndCylinderFormat.format(this.spherePower) + " "
                + sphereAndCylinderFormat.format(this.cylinderPower) + " "
                + axisFormat.format(this.axis);
    }

}
