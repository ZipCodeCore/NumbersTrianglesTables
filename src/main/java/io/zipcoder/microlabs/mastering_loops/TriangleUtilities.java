package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder newTri = new StringBuilder();

        for(int row=1; row < numberOfRows; row++) {
            for(int col=0; col < row; col++) {
                newTri.append("*");
            }
            newTri.append("\n");
        }
        return newTri.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder newRow = new StringBuilder();
        for(int i=0; i < numberOfStars; i++) {
            newRow.append("*");
        }
        return newRow.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder smallTri = new StringBuilder();
        for(int row=1; row < 5; row++) {
            for(int col=0; col < row; col++) {
                smallTri.append("*");
            }
            smallTri.append("\n");
        }
        return smallTri.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder getTri = new StringBuilder();
        for(int row=1; row < 10; row++) {
            for(int col=0; col < row; col++) {
                getTri.append("*");
            }
            getTri.append("\n");
        }
        return getTri.toString();
    }
}
