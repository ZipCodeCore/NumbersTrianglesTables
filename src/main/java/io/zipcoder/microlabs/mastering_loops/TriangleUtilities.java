package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String triangle = "";

        for (int i = 1; i < numberOfRows; i++){

            triangle += TriangleUtilities.getRow(i) + "\n";
        }

        return triangle;
    }

    public static String getRow(int numberOfStars) {

        String row = "";

        for (int i = 1; i <= numberOfStars; i++)
        {
            row += "*";

        }

        return row;
    }

    //
    public static String getSmallTriangle() {

       return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
