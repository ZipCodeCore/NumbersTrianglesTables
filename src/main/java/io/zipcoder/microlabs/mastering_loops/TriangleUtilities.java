package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String result = "";

        for (int iteration = 1; iteration < numberOfRows; iteration++) {
            result += getRow(iteration) +  "\n";
        }

        return result;
    }

    public static String getRow(int numberOfStars) {

        String getRow = "";

        for (int row = 0; row < numberOfStars; row++) {

            getRow += "*";
        }

        return getRow;

    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
