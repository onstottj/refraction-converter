package onstott.refractions.util;

import org.junit.Assert;
import org.junit.Test;

public class RefractionTest {

    @Test
    public void positiveCylinderToString() {
        Refraction refraction = new Refraction(-3.75, 2, 154);
        Assert.assertEquals("-3.75 +2.00 x154", refraction.toString());
    }

    @Test
    public void minusCylinderToString() {
        Refraction refraction = new Refraction(1.5, -1.25, 70);
        Assert.assertEquals("+1.50 -1.25 x070", refraction.toString());
    }

}
