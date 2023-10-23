package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder even = new StringBuilder();

        for (int i = start; i < stop; i++){
           if((i % 2) == 0){
                even.append(i);
           }
       }
        return even.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder odd = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if ((i % 2) != 0) {
                odd.append(i);
            }
        }
        return odd.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder square = new StringBuilder();
        for(int i = start; i < stop; i+= step){
            int squaredNum = (int)Math.pow(i, 2);
                square.append(squaredNum);
            }
        return square.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder range = new StringBuilder();
        for(int i = start; i < stop; i+= step){
            range.append(i);
        }
        return range.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder expo = new StringBuilder();
        for(int i = start; i < stop; i += step){
            int expoVar = exponent;
            int squaredNum = (int)Math.pow(i, expoVar);
            expo.append(squaredNum);
        }
        return expo.toString();
    }
}
