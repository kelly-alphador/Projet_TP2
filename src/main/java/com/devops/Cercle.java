package com.devops;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        if (rayon <= 0)
            throw new IllegalArgumentException("Le rayon doit être positif");
        this.rayon = rayon;
    }

    public double aire() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}