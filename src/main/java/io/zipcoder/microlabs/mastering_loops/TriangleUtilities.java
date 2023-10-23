package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < numberOfRows; row++) {
            builder.append(getRow(row));
        }
        return builder.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= numberOfStars; i++) {
            builder.append("*");
        }
        builder.append("\n");
        return builder.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
