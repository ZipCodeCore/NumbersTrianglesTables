package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sm = new StringBuilder();

        for (int x = 1; x < numberOfRows; x++) {
            for (int j = 0; j < x; j++) {
                sm.append("*");
            }
                sm.append("\n");
        }
        return sm.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder sm = new StringBuilder();

        for (int x = 0; x < numberOfStars; x++) {
            sm.append("*");
        }

        return sm.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder sm = new StringBuilder();
        for (int x = 1; x <= 5; x++) {
            for (int j = 0; j < x; j++) {
                sm.append("*");
            }
            sm.append("\n");
        }
        return sm.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder sm = new StringBuilder();
        for (int x = 1; x <= 9; x++) {
            for (int j = 0; j < x; j++) {
                sm.append("*");
            }
            sm.append("\n");
        }
        return sm.toString();
    }
}
