package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
    StringBuilder evenString = new StringBuilder();
        if (start % 2 == 0) {
        for (int i = start; i < stop; i++){
            evenString.append(i);
        }
    }
        return evenString.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddString = new StringBuilder();
        if (start % 2 == 1) {
            for (int i = start; i < stop; i++){
                oddString.append(i);
            }
        }
        return oddString.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squareString = new StringBuilder();

            for (int i = start; i < stop; i++){
                squareString.append(i*i);
            }
        return squareString.toString();
        }



    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
    StringBuilder range = new StringBuilder();

            for (int i = start; i<stop; i++) {
                range.append(i);
            } return range.toString();
    }
// must add to.String to range bc you made a string builder

    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder exponentString = new StringBuilder();

        for (int i = start; i < stop-1; i += step){
            exponentString.append(Math.pow(i,exponent));
        }
        return exponentString.toString();

    }
}
