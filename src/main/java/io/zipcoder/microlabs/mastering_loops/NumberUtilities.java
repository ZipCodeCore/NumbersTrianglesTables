package io.zipcoder.microlabs.mastering_loops;

import java.util.ArrayList;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenResults = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenResults += i;
            }
        }
        return evenResults;
    }

    public static String getOddNumbers(int start, int stop) {
        String oddResults = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddResults += i;
            }
        }
        return oddResults;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareItUpMyDude = "";
        for (int i = start; i < stop; i+=step) {
            int j = i * i;
            squareItUpMyDude += j;
        }
        return squareItUpMyDude;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        String totalRange = "";
        for (int i = start; i < stop; i+=step) {
            totalRange += i;
        }
        return totalRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentTimeMofo = "";
        for (int i = start; i < stop; i+=step) {
            int j = (int)Math.round(Math.pow(i, exponent));
            exponentTimeMofo += j;
        }
        return exponentTimeMofo;
    }
}
