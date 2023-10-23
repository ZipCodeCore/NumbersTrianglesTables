package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNum = new StringBuilder();

        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                evenNum.append(i);
            }

        }
        return evenNum.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddNum = new StringBuilder();

        for (int i = start; i < stop; i++){
            if (i % 2 != 0){
                oddNum.append(i);
            }
        }
        return oddNum.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squareNum = new StringBuilder();

        for (int i = start; i < stop; i = i + step){
            if (i < stop){
              int square = (int) Math.pow(i,2);
                squareNum.append(square);
            }

        }
        return squareNum.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder range = new StringBuilder();

        for (int i = start; i < stop; i += step){
            if (i < stop){
                range.append(i);
            }
        }
        return range.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder expoNum = new StringBuilder();

        for (int i = start; i < stop; i += step){
            if (i < stop){
                int expo = (int) Math.pow(i,exponent);
                expoNum.append(expo);
            }
        }
        return expoNum.toString();
    }
}
