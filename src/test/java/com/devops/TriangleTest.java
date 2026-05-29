package com.devops;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testPerimetre() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals(12.0, t.perimetre(), 0.001);
    }

    @Test
    public void testAire() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals(6.0, t.aire(), 0.001);
    }

    @Test
    public void testEstRectangle() {
        Triangle t = new Triangle(3, 4, 5);
        assertTrue(t.estRectangle());
    }

    @Test
    public void testNonRectangle() {
        Triangle t = new Triangle(5, 5, 5);
        assertFalse(t.estRectangle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCoteNegatif() {
        new Triangle(-1, 4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTriangleInvalide() {
        new Triangle(1, 2, 10); // 1+2 < 10
    }
}