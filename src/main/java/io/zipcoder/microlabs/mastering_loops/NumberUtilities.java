package io.zipcoder.microlabs.mastering_loops;

import java.util.*;
import java.lang.*;



public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        /*
        Description
        Given two integers, start, and stop,
        return a String concatenation of all even integers between start up to and not including stop.
         */

        StringBuilder sbEvenNumbers = new StringBuilder();

        if (start <= stop) {
            for (int i = start; i < stop; i++) {
                if (i % 2 == 0) {
                    sbEvenNumbers.append(i);
                }
            }
        }

        return sbEvenNumbers.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        /*
        Description
        Given two integers, start, and stop,
        return a String concatenation of all ODD integers between start up to and not including stop.
         */

        StringBuilder sbOddNumbers = new StringBuilder();

        if (start <= stop) {
            for (int i = start; i < stop; i++) {
                if (i % 2 != 0) {
                    sbOddNumbers.append(i);
                }
            }
        }

        return sbOddNumbers.toString();
    }

    //commented out original line, because it has an extra int: step
    public static String getSquareNumbers(int start, int stop, int step) {
    //public static String getSquareNumbers(int start, int stop) {
        /*
        Description
        Given two integers, start, and stop,
        return a String concatenation of all values squared between start up to and not including stop.
        --> ALSO step (increment values by "step" first, then square root them and then concatenate)
         */

        StringBuilder sbSquareNumbers = new StringBuilder();

        if (start <= stop) {
            for (int i = start; i < stop; i+=step) {
                sbSquareNumbers.append((int)Math.pow(i, 2));
            }
        }

        return sbSquareNumbers.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        /*
        Description
        Given three integers, start, stop, and step return a String concatenation
        of all integers between start up to and not including stop.
        */

        StringBuilder sbGetRange = new StringBuilder();

        if (start <= stop) {
            for (int i = start; i < stop; i+=step) {
                sbGetRange.append(i);
            }
        }

        return sbGetRange.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        /*
        Description
        Given four integers, start, stop, step, and exponent, return a String concatenation
        of all values, raised to the specified exponent, between start up to and not including stop,
        incrementing by the specified step.
         */

        StringBuilder sbGetExponentiations = new StringBuilder();

        if (start <= stop) {
            for (int i = start; i < stop; i+=step) {
                sbGetExponentiations.append((int)Math.pow(i, exponent));
            }
        }

        return sbGetExponentiations.toString();
    }
}
