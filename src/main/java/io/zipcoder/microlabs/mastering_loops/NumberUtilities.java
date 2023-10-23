package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String evenvalue = "";

        for (int i = start; i<stop; i++) {

            if (i %2 == 0){

                evenvalue += "" + i;
            }
        }
        return evenvalue;

    }


    public static String getOddNumbers(int start, int stop) {

        String oddvalue = "";

        for (int i = start; i < stop; i++) {

            if (i%2 != 0 ) {

                oddvalue += "" + i;

            }
        }
        return oddvalue;

    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String storesqnumbers = "";
    //int i is equal and while i is less then stop, i increases by steps increments(may have worded wrong)
        for (int i = start; i < stop; i += step) {
    //I am now concatenating into my storesqnumbers and I had to cast, on Math.pow because I was getting a float
                storesqnumbers += + (int)Math.pow(i,2);
        }
        //returning storesqnumbers
        return storesqnumbers;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

    String holder = "";

    for(int i = start; i < stop; i += step) {

        holder += i;
    }

        return holder;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String exp_num = "";

        for (int i = start; i < stop; i += step){
            exp_num += "" +(int)Math.pow(i, exponent);
        }
        return exp_num;
    }

}
