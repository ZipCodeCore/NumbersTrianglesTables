package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int count = 1; count < numberOfRows; count++) {
            for (int count2 = 0; count2 < count; count2++) {
                triangle.append("*");

            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

   public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int count = 0; count < numberOfStars; count++) {
            row.append("*");
        }

        return row.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder triangle = new StringBuilder();
        for (int count = 1; count < 5; count++) {
            for (int count2 = 0; count2 < count; count2++) {
                triangle.append("*");

            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder triangle = new StringBuilder();
        for (int count = 1; count < 11; count++) {
            for (int count2 = 0; count2 < count; count2++) {
                triangle.append("*");

            }
            triangle.append("\n");
        }
        return triangle.toString();
    }
}
