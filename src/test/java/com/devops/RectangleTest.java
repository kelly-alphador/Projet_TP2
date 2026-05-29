package com.devops;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testAire() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(24.0, r.aire(), 0.001);
    }

    @Test
    public void testPerimetre() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(20.0, r.perimetre(), 0.001);
    }

    @Test
    public void testEstCarre() {
        Rectangle carre = new Rectangle(5, 5);
        assertTrue(carre.estCarre());

        Rectangle rect = new Rectangle(4, 6);
        assertFalse(rect.estCarre());
    }
}