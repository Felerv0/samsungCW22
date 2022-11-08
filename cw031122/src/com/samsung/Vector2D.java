package com.samsung;

import java.util.Locale;

public class Vector2D {
    public double vX, vY;
    public static int count;

    public Vector2D() {
        vX = 1;
        vY = 1;
        count++;
    }

    public Vector2D(double x, double y) {
        vX = x;
        vY = y;
        count++;
    }

    public Vector2D(Vector2D vector) {
        vX = vector.vX;
        vY = vector.vY;
        count++;
    }

    public void print() {
        System.out.printf(Locale.US, "(%.2f, %.2f)\n", vX, vY);
    }

    public double length() {
        return Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
    }

    public void add(Vector2D vector) {
        vX += vector.vX;
        vY += vector.vY;
    }

    public void sub(Vector2D vector) {
        vX -= vector.vX;
        vY -= vector.vY;
    }

    public void scale(double scaleFactor) {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    public void normalized() {
        double len = length();
        vX /= len;
        vY /= len;
    }

    public double dotProduct(Vector2D vector) {
        return vX * vector.vX + vY * vector.vY;
    }
}
