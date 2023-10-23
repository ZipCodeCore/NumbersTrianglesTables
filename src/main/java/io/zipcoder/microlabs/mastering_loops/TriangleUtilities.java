package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder newTriangle = new StringBuilder("*\n");
        StringBuilder newLine = new StringBuilder("*");
        int counter = 1;
        while (counter < numberOfRows - 1) {
            newLine.append("*");
            newTriangle.append(newLine).append("\n");
            counter++;
        }

        return newTriangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder star = new StringBuilder();
        int counter = 1;
        while (counter <= numberOfStars) {
            star.append("*");
            counter++;
        }

        return star.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder newTriangle = new StringBuilder("*\n");
        StringBuilder newLine = new StringBuilder("*");
        int counter = 1;
        while (counter < 4) {
            newLine.append("*");
            newTriangle.append(newLine).append("\n");
            counter++;
        }

        return newTriangle.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder newTriangle = new StringBuilder("*\n");
        StringBuilder newLine = new StringBuilder("*");
        int counter = 1;
        while (counter < 9) {
            newLine.append("*");
            newTriangle.append(newLine).append("\n");
            counter++;
        }

        return newTriangle.toString();
    }
}
