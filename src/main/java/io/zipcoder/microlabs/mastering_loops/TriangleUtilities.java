package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder triangle = new StringBuilder();


        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append("*");
            }
            triangle.append("\n");

        }
        String completedTriangle = triangle.toString();

        return completedTriangle;
    }

    public static String getRow(int numberOfStars) {

        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            stars.append("*");
        }
        return stars.toString();
    }


    public static String getSmallTriangle() {

        StringBuilder smallTriangle = new StringBuilder();


        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                smallTriangle.append("*");
            }
            smallTriangle.append("\n");

        }
        String completedTriangle = smallTriangle.toString();
        return completedTriangle;
    }

    public static String getLargeTriangle() {

        StringBuilder largeTriangle = new StringBuilder();


        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                largeTriangle.append("*");
            }
            largeTriangle.append("\n");

        }
        String completedTriangle = largeTriangle.toString();
        return completedTriangle;
    }
}
