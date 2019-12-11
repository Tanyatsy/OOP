package com.company;

public class Cube extends GeometricBody {
  private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    double getSurface() {
        double surface = 6*Math.pow(length,2);
        return surface;
    }

    @Override
    double getVolume() {
        double volume = Math.pow(length,3);
        return  volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                '}';
    }
}
