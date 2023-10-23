package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {


    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = start; i < stop ; i++) {
            if(i % 2 == 0)
            {
                evenNumbers.append(i);
            }

        }


        return evenNumbers.toString();

    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder builderOddNumbers = new StringBuilder();
        for (int i = start; i < stop ; i++) {
            if(!(i % 2 == 0))
            {
                builderOddNumbers.append(i);
            }

        }


        return builderOddNumbers.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squareNumbersBuilder = new StringBuilder();
        for (int i = start; i <stop ; i = i + step) {
            int square = i * i;
            squareNumbersBuilder.append(square);
        }
        return squareNumbersBuilder.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder getRangeBuilder = new StringBuilder();
        for (int i = start; i <stop ; i = i + step) {

            getRangeBuilder.append(i);
        }
        return getRangeBuilder.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder exponentBuilder = new StringBuilder();
        for (int i = start; i < stop ; i = i + step){
            long exponentiatedValue = (long)Math.pow(i, exponent);
            exponentBuilder.append(exponentiatedValue);
        }

        return exponentBuilder.toString();
    }
}
