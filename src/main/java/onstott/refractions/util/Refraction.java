package onstott.refractions.util;

import java.text.DecimalFormat;

/** Model that represents the refraction for an astigmatic eye */
public class Refraction {

    /** See https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html & https://stackoverflow.com/a/5243412/132374 */
    private static DecimalFormat sphereAndCylinderFormat = new DecimalFormat("+0.00;-0.00");
    private static DecimalFormat axisFormat = new DecimalFormat("x000");

    private double spherePower;
    private double cylinderPower;
    private double xAxis;

    public Refraction(double spherePower, double cylinderPower, double xAxis) {
        this.spherePower = spherePower;
        this.cylinderPower = cylinderPower;
        this.xAxis = xAxis;
    }

    public double getSpherePower() {
        return spherePower;
    }

    public double getCylinderPower() {
        return cylinderPower;
    }

    public double getxAxis() {
        return xAxis;
    }

    @Override
    public String toString() {
        return sphereAndCylinderFormat.format(this.spherePower) + " "
                + sphereAndCylinderFormat.format(this.cylinderPower) + " "
                + axisFormat.format(this.xAxis);
    }

}
