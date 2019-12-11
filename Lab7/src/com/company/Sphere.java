package com.company;

import static java.lang.Math.PI;

public class Sphere extends GeometricBody {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        double surface = 4* PI*Math.pow(radius,2);
        return surface;
    }


    @Override
    public double getVolume() {
        double volume =  4/3* PI*Math.pow(radius,3);
        return volume;
    }


    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
