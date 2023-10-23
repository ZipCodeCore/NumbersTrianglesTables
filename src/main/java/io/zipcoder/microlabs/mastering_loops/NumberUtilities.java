package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder even = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                even.append(i);
            }

        }
        return even.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder odd = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                odd.append(i);
            }

        }
        return odd.toString();


    }

    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squared = new StringBuilder();
        for (int i = start; i < stop; i += step) {

            squared.append(i * i);


        }

        return squared.toString();

    }

    public static String getRange(int stop) {
        StringBuilder range1 = new StringBuilder();
        for (int i =0; i < stop; i++) {

            range1.append(i);


        }
        return range1.toString();




    }

    public static String getRange(int start, int stop) {
        StringBuilder range = new StringBuilder();
        for (int i = start; i < stop; i++) {

            range.append(i);


        }
        return range.toString();



    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder rangeNum = new StringBuilder();
        for (int i = start; i < stop; i += step) {

            rangeNum.append(i);


        }
        return rangeNum.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder old = new StringBuilder();
        for (int i = start; i < stop; i += step) {

            old.append(i * i);
        }
        return old.toString();
    }
}


