package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String evens = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evens += Integer.toString(i);
            }
        }

        return evens;
    }


    public static String getOddNumbers(int start, int stop) {

        String odds = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                odds += Integer.toString(i);
            }
        }

        return odds;

    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String roots = "";
        for (int i = start; i < stop; i += step) {
            roots += Integer.toString(i * i);
        }
        return roots;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        String rangeString = "";
        for (int i = start; i < stop; i += step) {
            rangeString += Integer.toString(i);
        }
        return rangeString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String exponentString = "";
        for (int i = start; i < stop; i += step) {
            exponentString += (int) Math.pow(i, exponent);
        }
        return exponentString;
    }
}
