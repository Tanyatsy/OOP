package com.company;

import java.util.ArrayList;

public class GeometricBodyController {

    public static double getBiggestVolumebody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody biggestVolumeBody = geometricBodies.get(0);
        for (int i = 0; i < geometricBodies.size(); i++)
            if (biggestVolumeBody.getVolume() < geometricBodies.get(i).getVolume())
                biggestVolumeBody = geometricBodies.get(i);

            return biggestVolumeBody.getVolume();


    }
    public static double getBiggestSurfacebody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody biggestSurfaceBody = geometricBodies.get(0);
        for (int i = 0; i < geometricBodies.size(); i++)
            if (biggestSurfaceBody.getVolume() < geometricBodies.get(i).getVolume())
                biggestSurfaceBody = geometricBodies.get(i);

        return biggestSurfaceBody.getSurface();

    }

}
