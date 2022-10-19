package com.samsung;

public class Geom {
    public static double segmentLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x3, y3, x1, y1);
    }
}
