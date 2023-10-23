package io.zipcoder.microlabs.mastering_loops;

import java.lang.*;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder customTri = new StringBuilder("");
        for (int i = 1; i <= numberOfRows - 1; i++) {
            customTri.append(getRow(i));
            customTri.append("\n");
        }
        return customTri.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder rowStarString = new StringBuilder("");
        for (int i = 0; i < numberOfStars; i++) {
            rowStarString.append("*");
        }
        return rowStarString.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
