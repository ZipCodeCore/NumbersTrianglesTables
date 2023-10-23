package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        for (int i = 0; i < numberOfStars; i++){
            output += "*";
        }
        return output;
    }

    public static String getTriangle(int numberOfRows) {
        String output = "";
        for (int i = 0; i < numberOfRows; i++){
            output += getRow(i+1);
            output += "\n";
        }
        return output;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
