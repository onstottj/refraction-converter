package onstott.refractions.util;

/** Model that represents the refraction for an astigmatic eye */
public class Refraction {

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

}
