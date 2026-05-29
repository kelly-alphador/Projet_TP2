package com.devops;

public class App {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("=== Formes Géométriques ===");
        System.out.println("Triangle (3,4,5) — périmètre : " + t.perimetre());
        System.out.println("Triangle (3,4,5) — aire     : " + t.aire());

        Cercle c = new Cercle(5);
        System.out.println("Cercle  (r=5)   — aire      : " + c.aire());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle (4x6) — aire      : " + r.aire());
    }
}