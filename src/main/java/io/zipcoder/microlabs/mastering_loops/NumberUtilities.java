package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evens = new StringBuilder();
        for (int i = start; i <stop; i++) {
            if (i % 2 == 0) {
                evens.append(i);
            }
        }

        return evens.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder odds = new StringBuilder();
        for (int i = start; i <stop; i++) {
            if (i % 2 == 1) {
                odds.append(i);
            }
        }

        return odds.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder getSquares = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            getSquares.append((int) Math.pow(i,2));
        }

        return getSquares.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder myRange = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            myRange.append(i);
        }

        return myRange.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder myExponents = new StringBuilder();
        for (int i = start; i<stop; i+=step){
            myExponents.append((int) Math.pow(i,exponent));
        }

        return myExponents.toString();
    }
}
