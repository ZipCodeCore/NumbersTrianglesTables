package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {


        String n = "";

        for (int i = start; i <stop; i++) {


            if (i % 2 == 0) {
               n = n + i;
            }

        }

        return n;
    }



        public static String getOddNumbers(int start, int stop) {

            String n = "";

            for (int i = start; i <stop; i++) {


                if (i % 2!= 0) {
                    n = n + i;
                }

            }

            return n;
        }




    public static String getSquareNumbers(int start, int stop, int step) {

        String n = "";



        for (int i = start; i <stop; i+=step) {


                n = n + (i*i);
            }



        return n;


    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {

        String n = "";

        for (int i = start; i <stop; i+=step){

            n = n + i;
        }

        return n;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        String n = "";

        for (int i = start; i <stop; i+=step){

          int x = (int)Math.pow(i, exponent);
          n += String.valueOf(x);

        }





        return n;
    }
}
