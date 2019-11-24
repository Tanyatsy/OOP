package com.company;

import java.util.Scanner;

public class FirstLab {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();


        monitor1.color = "silver";
        monitor1.dimensions = 13.5f;
        monitor1.resolution = "1960*1780";

        monitor2.color = "gold";
        monitor2.dimensions = 13.5f;
        monitor2.resolution = "1960*2060";


        System.out.println(monitor1.dimensions);

        Helper changemonitor = new Helper();
        changemonitor.populate(monitor1);

        System.out.println(monitor1.dimensions);
        System.out.println(monitor1.color);


        if ((monitor1.dimensions == monitor2.dimensions) && monitor1.resolution.equals(monitor2.resolution) && monitor2.color.equals(monitor1.color)) {
            System.out.println("\nThe monitors are the same");
        } else {
            System.out.println("\nThe monitors are not equal");

        }




    }

}


class Monitor {
        String color;
        float dimensions;
        String resolution;


    }


