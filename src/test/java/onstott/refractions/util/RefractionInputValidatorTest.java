package onstott.refractions.util;

import org.junit.Assert;
import org.junit.Test;

public class RefractionInputValidatorTest {

    private RefractionInputValidator validator = new RefractionInputValidator();

    @Test
    public void parseValidSpherePower() {
        Assert.assertEquals(1.25, validator.parseSpherePower("1.25"), 0);
        Assert.assertEquals(12, validator.parseSpherePower("12.00"), 0);
    }

    @Test(expected = NumberFormatException.class)
    public void parseInvalidSpherePower() {
        validator.parseSpherePower("abc");
    }

    @Test(expected = NumberFormatException.class)
    public void parseOutOfRangeSpherePower() {
        validator.parseSpherePower("100");
    }

    @Test
    public void parseValidCylinderPower() {
        Assert.assertEquals(0, validator.parseCylinderPower("0.00"), 0);
        Assert.assertEquals(10, validator.parseCylinderPower("10.00"), 0);
    }

    @Test(expected = NumberFormatException.class)
    public void parseInvalidCylinderPower() {
        validator.parseCylinderPower("abc");
    }

    @Test(expected = NumberFormatException.class)
    public void parseOutOfRangeCylinderPower() {
        validator.parseCylinderPower("100");
    }

    @Test
    public void parseValidAxis() {
        Assert.assertEquals(70, validator.parseAxis("x070"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseInvalidAxis() {
        Assert.assertEquals(70, validator.parseAxis("070"));
    }

    @Test
    public void testAxisStandardization() {
        Assert.assertEquals(180, validator.standardizeAxis(0));
        Assert.assertEquals(17, validator.standardizeAxis(197));
        Assert.assertEquals(150, validator.standardizeAxis(-30));
    }

}
