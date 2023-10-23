package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        for (int x = start; x <=stop; x++) {
            if (x % 2 == 0) {
               even += Integer.toString(x);
            }
        }

        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        for (int x = start; x <=stop; x++) {
            if (x % 2 != 0) {
                odd += Integer.toString(x);
            }
        }

        return odd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String sqrt = "";

        for(int x = start; x <= stop; x+=step ) {
               int num = x * x;
               sqrt += Integer.toString(num);

        }

        return sqrt;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int x = start; x <=stop; x += step) {
            range += Integer.toString(x);
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expo = "";

        for(int x = start; x < stop; x+=step ) {
            int num = (int) Math.pow(x,exponent);
            expo += Integer.toString(num);

        }

        return expo;
    }
}
