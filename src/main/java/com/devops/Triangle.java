package com.devops;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Les côtés doivent être positifs");
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("Ces côtés ne forment pas un triangle valide");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimetre() {
        return a + b + c;
    }

    // Formule de Héron
    public double aire() {
        double s = perimetre() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean estRectangle() {
        double[] cotes = {a, b, c};
        java.util.Arrays.sort(cotes);
        // Pythagore : c² = a² + b²
        return Math.abs(cotes[2]*cotes[2] - (cotes[0]*cotes[0] + cotes[1]*cotes[1])) < 1e-9;
    }
}