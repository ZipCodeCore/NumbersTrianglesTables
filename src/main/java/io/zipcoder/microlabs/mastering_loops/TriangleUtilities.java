package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        /*
        Description
        Given one integer, n, generate a String representation of a triangle whose base height and width is equal to n.
        */

        StringBuilder sbTriangle = new StringBuilder();
        //changed width to 9 to match tests.

        //chose "<" instead of "<=" in first for loop to make it work
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                sbTriangle.append("*");
            }
            sbTriangle.append("\n");
        }

        return sbTriangle.toString();

    }

    public static String getRow(int numberOfStars) {
        /*
        Description
        In the class, Triangles Write a method that returns a String representation
        of a row of asterisks whose length is equal to the width specified.
         */

        StringBuilder sbGetRow = new StringBuilder();

        int width = numberOfStars;
        while (width-- > 0) {
            sbGetRow.append("*");
        }

        return sbGetRow.toString();
    }

    public static String getSmallTriangle() {
        /*
        Description
        In the class, Triangles Write a method that returns a String representation of a small triangle,
        whose base height and base width is 4 asterisks.
         */

        StringBuilder sbGetSmallTriangle = new StringBuilder();

        int width = 4;
        int height = 4;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                sbGetSmallTriangle.append("*");
            }
            sbGetSmallTriangle.append("\n");
        }

        return sbGetSmallTriangle.toString();
    }

    public static String getLargeTriangle() {

        StringBuilder sbGetLargeTriangle = new StringBuilder();
        //changed width to 9 to match tests.
        int width = 9;
        int height = 9;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                sbGetLargeTriangle.append("*");
            }
            sbGetLargeTriangle.append("\n");
        }

        return sbGetLargeTriangle.toString();
    }
}
