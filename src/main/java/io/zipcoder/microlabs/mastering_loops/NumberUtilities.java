package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String outcome = "";

        for (int i = start; i <= stop; i++){

            if (i % 2 == 0)
            {

            outcome += i;

            }

        }

        return outcome;
    }


    public static String getOddNumbers(int start, int stop) {

        String outcome = "";

        for (int i = start; i <= stop; i++)

        {
            if (i % 2 != 0)
            {

                outcome += i;

            }
        }


        return outcome;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String outcome = "";

        for (int i = start; i < stop; i += step)
        {
             outcome += i * i;
        }

        return outcome;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        String outcome = "";

        for (int i = start; i < stop; i += step)
        {
            outcome += i;

        }

        return outcome;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
