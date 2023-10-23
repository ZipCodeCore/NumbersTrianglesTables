package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNumbers = new StringBuilder();
        for (int count = start; count < stop; count++) {
            if (count % 2 == 0) {
                evenNumbers.append(count);

            }

        }

        return evenNumbers.toString();
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder oddNumbers = new StringBuilder();
        for (int count = start; count < stop; count++) {
            if (count % 2 == 1) {
                oddNumbers.append(count);

            }

        }

        return oddNumbers.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squaredNumbers = new StringBuilder();
        for (int count = start; count < stop; count += step) {

            squaredNumbers.append(count * count);


        }

        return squaredNumbers.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder rangeNumbers = new StringBuilder();
        for (int count = start; count < stop; count += step) {

            rangeNumbers.append(count);


        }

        return rangeNumbers.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder expoNumbers = new StringBuilder();

        for (int count = start; count < stop; count += step) {
            int exp = count;
            for (int count2 = 1; count2 < exponent; count2++) {
                exp = exp * count;

            }
            expoNumbers.append(exp);


        }

        return expoNumbers.toString();
    }

    public static String getRange(int stop) {
        String result = NumberUtilities.getRange(0, stop, 1);
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = NumberUtilities.getRange(start, stop, 1);
        return result;
    }
}