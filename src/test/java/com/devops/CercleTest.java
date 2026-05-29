package com.devops;

import org.junit.Test;
import static org.junit.Assert.*;

public class CercleTest {

    @Test
    public void testAire() {
        Cercle c = new Cercle(5);
        assertEquals(Math.PI * 25, c.aire(), 0.001);
    }

    @Test
    public void testPerimetre() {
        Cercle c = new Cercle(1);
        assertEquals(2 * Math.PI, c.perimetre(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRayonNegatif() {
        new Cercle(-3);
    }
}