package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String myTriangle = "";
        for (int i = 1; i <numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                myTriangle += "*";
            }
            myTriangle += "\n";
        }
        return myTriangle;
    }

    public static String getRow(int numberOfStars) {
        /*StringBuilder myTriangle = new StringBuilder();
        for(int i=0;i<numberOfStars;i++){
            myTriangle.append('*');
        }
        String myStrTriangle = myTriangle.toString();
        return myStrTriangle;*/
        String myRow = "";
        for (int i = 0; i < numberOfStars; i++) {
            myRow += "*";
        }
        return myRow;
    }

    public static String getSmallTriangle() {
        String mySmallTriangle = "";
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                mySmallTriangle += "*";
            }
            mySmallTriangle += "\n";
        }
        return mySmallTriangle;
    }


    public static String getLargeTriangle() {
        String myLargeTriangle = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                myLargeTriangle += "*";
            }
            myLargeTriangle += "\n";
        }
        return myLargeTriangle;
    }
}
