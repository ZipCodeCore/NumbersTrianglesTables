package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder outcome = new StringBuilder();


        for (int i=1; i < numberOfRows; i++) {

            for (int j=0; j < i; j++){

                outcome.append("*");
            }
                outcome.append("\n");

            }


            return outcome.toString();
    }

    public static String getRow(int numberOfStars) {

        StringBuilder outcome = new StringBuilder();


        for (int i=0; i < numberOfStars; i++){

            outcome.append("*");

        }


        return outcome.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder outcome = new StringBuilder();


        for (int i=1; i <=4; i++) {

            for (int j=0; j < i; j++){

                outcome.append("*");
            }
            outcome.append("\n");

        }


        return outcome.toString();



    }

    public static String getLargeTriangle() {

        StringBuilder outcome = new StringBuilder();


        for (int i=1; i <=9; i++) {

            for (int j=0; j < i; j++){

                outcome.append("*");
            }
            outcome.append("\n");

        }


        return outcome.toString();


    }
}
