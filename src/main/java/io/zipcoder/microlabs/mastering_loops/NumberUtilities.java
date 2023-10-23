package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder evenNumbers = new StringBuilder();

        for(int i = start; i < stop; i++){

            if (i % 2 == 0){
                evenNumbers.append(i);
            }
        }


        return evenNumbers.toString();
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder oddNumbers = new StringBuilder();

        for(int i = start; i < stop; i++){

            if (i % 2 != 0){
                oddNumbers.append(i);
            }
        }


        return oddNumbers.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {

        StringBuilder squareNumbers = new StringBuilder();

        for(int i = start; i < stop; i += step){



                squareNumbers.append((int)(Math.pow(i,2)));
            }


        return squareNumbers.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder rangeNumbers = new StringBuilder();

        for(int i = start; i < stop; i += step){



            rangeNumbers.append(i);
        }


        return rangeNumbers.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder exponentNumbers = new StringBuilder();

        for(int i = start; i < stop; i += step){



            exponentNumbers.append((int)(Math.pow(i,exponent)));
        }


        return exponentNumbers.toString();
    }

}

