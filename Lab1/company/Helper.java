package com.company;

import java.util.Scanner;

public class Helper {
    public void populate( Monitor x) {
        System.out.println("\n Write new dimensions");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        x.dimensions = Float.parseFloat(inputString);

    }
}

