package io.zipcoder.microlabs.mastering_loops;

import java.util.Collection;
import java.util.Collections;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++){
            pyramid.append(String.join("", Collections.nCopies(i, "*")));
            pyramid.append("\n");
        }
        return pyramid.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            pyramid.append("*");
        }
        return pyramid.toString();
    }

    public static String getSmallTriangle() {
        String pyramid =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        return pyramid;
    }

    public static String getLargeTriangle() {
        String pyramid =
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******\n" +
                        "********\n" +
                        "*********\n";
        return pyramid;
    }
}
