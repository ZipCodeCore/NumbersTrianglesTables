package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder myTri = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                myTri.append("*");
            }
                myTri.append("\n");
        }

        return myTri.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder newRow = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            newRow.append("*");
        }
        return newRow.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder smallTri = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                smallTri.append("*");
            }
            smallTri.append("\n");
        }

        return smallTri.toString();
    }

    public static String getLargeTriangle() {

        StringBuilder largeTri = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                largeTri.append("*");
            }
            largeTri.append("\n");
        }

        return largeTri.toString();
    }
    }

