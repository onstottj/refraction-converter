package onstott.refractions.util;

import org.junit.Assert;
import org.junit.Test;

public class RefractionConverterTest {

    private RefractionConverter converter = new RefractionConverter();

    @Test
    public void convertPlusCylinderNotation() {
        Refraction result = converter.convert(new Refraction(1.5, -1.25, 80));
        Assert.assertEquals(.25, result.getSpherePower(), 0);
        Assert.assertEquals(1.25, result.getCylinderPower(), 0);
        Assert.assertEquals(170, result.getAxis());
    }

    @Test
    public void convertNegativeCylinderNotation() {
        Refraction result = converter.convert(new Refraction(.25, 1.25, 170));
        Assert.assertEquals(1.5, result.getSpherePower(), 0);
        Assert.assertEquals(-1.25, result.getCylinderPower(), 0);
        Assert.assertEquals(80, result.getAxis());
    }

}
