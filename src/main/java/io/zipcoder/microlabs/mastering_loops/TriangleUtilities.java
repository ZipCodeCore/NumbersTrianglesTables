package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder myRange = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++){
            for (int n = 1; n <= i; n++) {
                myRange.append("*");
            }
            myRange.append("\n");
        }
        return myRange.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder myRange = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            myRange.append("*");
        }
        return myRange.toString();

    }

    public static String getSmallTriangle() {
        StringBuilder myRange = new StringBuilder();
        for (int i = 1; i <= 4; i++){
            for (int n = 1; n <= i; n++) {
                myRange.append("*");
            }
            myRange.append("\n");
        }
        return myRange.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder myRange = new StringBuilder();
        for (int i = 1; i < 10; i++){
            for (int n = 1; n <= i; n++) {
                myRange.append("*");
            }
            myRange.append("\n");
        }
        return myRange.toString();
    }
}
