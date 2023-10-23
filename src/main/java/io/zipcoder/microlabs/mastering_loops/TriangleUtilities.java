package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder myString = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {

            for (int j = 0; j < i; j++) {
                myString.append("*");

            }
            myString.append("\n");
        }

        return myString.toString();
    }

    public static String getRow(int numberOfStars) {

        StringBuilder myString = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            myString.append("*");
        }

        return myString.toString();

    }

    public static String getSmallTriangle() {

        StringBuilder myString = new StringBuilder();

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j < i; j++) {
                myString.append("*");

            }
            myString.append("*\n");

        }

        return myString.toString();
    }

    public static String getLargeTriangle() {

       StringBuilder myString = new StringBuilder();

       for (int i = 0; i <= 8; i++) {

           for (int j = 0; j < i; j++) {
               myString.append("*");
           }

           myString.append("*\n");

       }

       return myString.toString();

    }
}
