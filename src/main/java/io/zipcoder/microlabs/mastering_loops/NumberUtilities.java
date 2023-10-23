package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
git
        StringBuilder evensOnly = new StringBuilder();
        for(int i = start; i <= stop; i++) {
            if(i % 2 == 0) {
                evensOnly.append(i);
            }
        }
        return evensOnly.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddsOnly = new StringBuilder();
        for(int i = start; i <= stop; i++) {
            if(i % 2 != 0) {
                oddsOnly.append(i);
            }
        }
        return oddsOnly.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder range = new StringBuilder();
        for(int i = start; i < stop; i += step) {
            range.append(i);
        }
        return range.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder exponentials = new StringBuilder();
        for(int i = start; i < stop; i += step) {
            exponentials.append((int)Math.pow(i, exponent));
        }
        return exponentials.toString();
    }
}
