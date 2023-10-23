package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder anyTriangle = new StringBuilder();
        int size = numberOfRows;
        int row = 1;

        for (int i = 1; i <= size; i++) {

            for (int k = 1; k <= row; k++) {
                anyTriangle.append("*");
            }
            anyTriangle.append("\n");
            row++;
        }

        return anyTriangle.toString();
    }



    public static String getRow(int numberOfStars) {

        StringBuilder asteriskRow = new StringBuilder();

        for (int i = 0; i <= numberOfStars - 1; i++) {
            asteriskRow.append("*");
        }

        return asteriskRow.toString();
    }


    public static String getSmallTriangle() {

        StringBuilder smallTriangle = new StringBuilder();
        int size = 4;
        int row = 1;

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= row; k++) {
                smallTriangle.append("*");
            }
            smallTriangle.append("\n");
            row++;
        }
        return smallTriangle.toString();

    }


    public static String getLargeTriangle() {

        StringBuilder largeTriangle = new StringBuilder();
        int size = 9;
        int row = 1;

        for (int i = 1; i <= size; i++) {

            for (int k = 1; k <= row; k++) {
                largeTriangle.append("*");
            }

            largeTriangle.append("\n");
            row++;
        }
        return largeTriangle.toString();


    }
}
