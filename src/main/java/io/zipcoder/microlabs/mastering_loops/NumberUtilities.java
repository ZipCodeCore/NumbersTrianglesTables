package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNums = "";
        for (int i = start; i < stop; i++){
            if (i %2 == 0){
                evenNums += i;
            }
        }

        return evenNums;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNums = "";
        for (int i = start; i < stop; i++){
            if (i %2 != 0){
                oddNums += i;
            }
        }

        return oddNums;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String sqNums = "";
        for ( int i = start; i < stop; i += step){
            sqNums += (int)Math.pow(i,2.0);
        }
        return sqNums;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeOfNums = "";
        for (int i = start; i < stop; i += step){
            rangeOfNums += i;
        }
        return rangeOfNums;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exNums = "";
        for (int i = start; i < stop; i += step) {
            exNums += (int) Math.pow(i, exponent);
        }
        return exNums;
    }
}
