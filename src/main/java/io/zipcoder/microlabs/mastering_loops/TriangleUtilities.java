package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String triangle = "";
        for(int i=1; i <numberOfRows; i++)
        {
            for(int j=0; j < i; j++){
                triangle+= "*";
            }triangle+= "\n";

        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {

            String output = "";
            for (int i = 0; i < numberOfStars; i++) {
                output += "*";
            }
            return output;
        }


    public static String getSmallTriangle() {

        String triangle = "";
        for(int i=1; i <=4; i++)
        {
            for(int j=0; j < i; j++){
                triangle+= "*";
            }triangle+= "\n";

        }
        return triangle;

    }

    public static String getLargeTriangle() {
        String triangle = "";
        for(int i=1; i <=9; i++)
        {
            for(int j=0; j < i; j++){
                triangle+= "*";
            }triangle+= "\n";

        }
        return triangle;
    }
}
