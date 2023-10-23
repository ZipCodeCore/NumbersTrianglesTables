package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        System.out.println("Get Triangle");
        String resultString = "";
        System.out.println(resultString);
        for (int i = 1; i < numberOfRows; i++){

            String rowofStars = "";
            for (int j = 0; j < i; j++){
                rowofStars = rowofStars + "*";

            }
            resultString = resultString + rowofStars + "\n";
        }

        return resultString;
    }

    public static String getRow(int numberOfStars) {
        System.out.println("Get Row");
        String resultString = "";
       for (int i = 0; i < numberOfStars; i++){
           resultString = resultString + "*";
       }
       return resultString;
    }

    public static String getSmallTriangle() {
        System.out.println("Get Small Triangle");
        String resultString = "";
        System.out.println(resultString);
        for (int i = 1; i < 5; i++){
            String rowofStars = "";
            for (int j = 0; j < i; j++){
                rowofStars = rowofStars + "*";

            }
            resultString = resultString + rowofStars + "\n";
        }

        return resultString;
    }

    public static String getLargeTriangle() {
        System.out.println("Get Large Triangle");
        String resultString = "";
        System.out.println(resultString);
        for (int i = 1; i < 10; i++){
            String rowofStars = "";
            for (int j = 0; j < i; j++){
                rowofStars = rowofStars + "*";

            }
            resultString = resultString + rowofStars + "\n";
        }

        return resultString;
    }
}
