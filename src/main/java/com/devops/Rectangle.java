package com.devops;

public class Rectangle {
    private double largeur, hauteur;

    public Rectangle(double largeur, double hauteur) {
        if (largeur <= 0 || hauteur <= 0)
            throw new IllegalArgumentException("Les dimensions doivent être positives");
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    public boolean estCarre() {
        return largeur == hauteur;
    }
}