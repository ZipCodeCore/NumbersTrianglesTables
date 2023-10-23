package io.zipcoder.microlabs.mastering_loops;




public class NumberUtilities {


    public static String getEvenNumbers(int start, int stop) {
        StringBuilder myRange = new StringBuilder();
        for (int i = start; i < stop; i+=2){
            myRange.append(i);
        }
        return myRange.toString();

    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder myRange = new StringBuilder();
        for (int i = start; i < stop; i+=2){
            myRange.append(i);
        }
        return myRange.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder myRange = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            myRange.append((long)(Math.pow(i,2)));
        }
        return myRange.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
       StringBuilder myRange = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            myRange.append(i);
        }
        return myRange.toString();


    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder myRange = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            myRange.append((long)(Math.pow(i, exponent)));
        }
        return myRange.toString();
    }
}
