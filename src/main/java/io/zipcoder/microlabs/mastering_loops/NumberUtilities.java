package io.zipcoder.microlabs.mastering_loops;


import java.util.Scanner;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";

        for(int i= start; i <= stop; i++) {
            if(i % 2 == 0) {
                evenNumbers += Integer.toString(i);
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";

        for(int i= start; i <= stop; i++) {
            if(i % 2 != 0) {
                oddNumbers += Integer.toString(i);
            }
        }
        return oddNumbers;
    }



    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNums = "";

            for (int i = start; i < stop; i += step) {
                int answer = (int)(Math.pow(i, 2));
                squareNums += Integer.toString(answer);
                }

        return squareNums;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder newRange = new StringBuilder();

            for (int i = start; i < stop; i += step) {
                newRange.append(i);
            }
            String completeRange = newRange.toString();

            return completeRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder newValues = new StringBuilder();

        for (int i = start; i < stop; i += step) {
            int answer = (int) (Math.pow(i, exponent));
            newValues.append(answer);
        }
        String completeValues = newValues.toString();

        return completeValues;
    }
}
