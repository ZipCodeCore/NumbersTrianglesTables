package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        for (int x = start; x <= stop; x++) {
            if (x % 2 == 0) {
                even += Integer.toString(x);
            }
        }
        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        for (int x = start; x <= stop; x++) {
            if (x % 2 != 0) {
                odd += Integer.toString(x);
            }
        }
        return odd;
    }



    public static String getSquareNumbers(int start, int stop, int step) {

        StringBuilder square = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            int squaredNum = (int) Math.pow(i, 2);
            square.append(squaredNum);
        }
        return square.toString();
    }
        public static String getRange ( int start, int stop, int step){

            StringBuilder range = new StringBuilder();

            for (int i = start; i < stop; i += step) {

                range.append(i);
            }
            return range.toString();
        }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


        public static String getExponentiations ( int start, int stop, int step, int exponent){
            StringBuilder expon = new StringBuilder();

            for (int i = start; i < stop; i+= step) {

                int exponVar = exponent;

                int startExpon = (int) Math.pow(i, exponVar);

                expon.append(startExpon);
            }
            return expon.toString();
            }
        }
