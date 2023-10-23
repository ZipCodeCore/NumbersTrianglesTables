package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder myString = new StringBuilder();


        for (int i = start; i < stop; i += 2) {
            myString.append(i);
        }

        return myString.toString();


    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder myString = new StringBuilder();


        for (int i = start; i < stop; i += 2) {
            myString.append(i);
        }

        return myString.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {


        StringBuilder myString = new StringBuilder();


        for (int i = start; i < stop; i += step) {
            myString.append(i * i);

        }

        return myString.toString();

    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder myString = new StringBuilder();

        for (int i = start; i < stop; i += step) {
            myString.append(i);
        }

        return myString.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder myString = new StringBuilder();


        for (int i = start; i < stop; i += step) {
            myString.append((long)(Math.pow(i, 2)));

        }

        return myString.toString();

    }
}
