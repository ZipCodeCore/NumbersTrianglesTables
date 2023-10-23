package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangleBuilder = new StringBuilder();

        for (int i = 1; i <= numberOfRows-1; i++) {
            for (int w = 1; w <= i ; w++) {
                triangleBuilder.append("*");
            }
            triangleBuilder.append("\n");
        }

        return triangleBuilder.toString();
    }

    public static String getRow(int numberOfStars) {

        StringBuilder asteriskRowBuild = new StringBuilder();
        for(int i = 1; i <= numberOfStars; i++) {
            asteriskRowBuild.append("*");
        }
        return asteriskRowBuild.toString();
    }

    public static String getSmallTriangle() {

        StringBuilder smallTriangle = new StringBuilder();
        for (int i =1; i <= 4; i++) {
            for (int w = 1; w <= i; w ++) {
                smallTriangle.append("*");
            }
            smallTriangle.append("\n");
        }
        return smallTriangle.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder largeTriangle = new StringBuilder();
        for (int i =1; i <= 9; i++) {
            for (int w = 1; w <= i; w++) {
                largeTriangle.append("*");
            }
            largeTriangle.append("\n");
        }
        return largeTriangle.toString();
    }
}
