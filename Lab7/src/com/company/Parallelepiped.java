package com.company;

public class Parallelepiped extends GeometricBody {
    private double length;
    private double height;
    private double width;

    Parallelepiped(double length,double height,double width){
        this.length=length;
        this.height=height;
        this.width=width;
    }
    @Override
    public double getSurface() {
        double surface = length*width*height;
        return surface;
    }

    @Override
    public double getVolume() {
        double volume = 2*(length*height+width*height+length*width);;
        return volume;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
