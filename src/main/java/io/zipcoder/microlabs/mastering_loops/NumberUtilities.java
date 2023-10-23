package io.zipcoder.microlabs.mastering_loops;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder numList = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                numList.append(i);
            }
        }

        return numList.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder numList = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                numList.append(i);
            }
        }

        return numList.toString();
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder numList = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            int x = (int) Math.pow(i, 2);
            numList.append(String.valueOf(x));
        }

        return numList.toString();
    }

    public static String getRange(int stop) {
        StringBuilder numList = new StringBuilder();
        for (int i = 0; i < stop; i++)
            numList.append(String.valueOf(i));
        return numList.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder numList = new StringBuilder();
        for (int i = start; i < stop; i++)
            numList.append(String.valueOf(i));
        return numList.toString();
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder numList = new StringBuilder();
        for (int i = start; i < stop; i+=step)
            numList.append(String.valueOf(i));
        return numList.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder numList = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            int x = (int) Math.pow(i, exponent);
            numList.append(String.valueOf(x));
        }

        return numList.toString();
    }
}