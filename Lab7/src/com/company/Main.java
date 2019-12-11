package com.company;

import javafx.print.Printer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList <> ();
        GeometricBody cube = new Cube (1);
        GeometricBody sphere = new Sphere (2);
        GeometricBody parallelepiped = new Parallelepiped(2,3,6);
        geometricBodies.add(cube);
        geometricBodies.add(sphere);
        geometricBodies.add(parallelepiped);
        System.out.println("BiggestVolumebody : " + GeometricBodyController.getBiggestVolumebody(geometricBodies));
        System.out.println("BiggestSurfacebody : " + GeometricBodyController.getBiggestSurfacebody(geometricBodies));

        if (GeometricBodyController.getBiggestVolumebody(geometricBodies) == cube.getVolume())
            System.out.println("is Cube");
        else if (GeometricBodyController.getBiggestVolumebody(geometricBodies) == sphere.getVolume())
            System.out.println("is Sphere");
        else
            System.out.println("is Parallelepiped");
    }


}
