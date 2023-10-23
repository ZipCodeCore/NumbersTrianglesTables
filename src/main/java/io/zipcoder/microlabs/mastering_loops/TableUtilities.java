package io.zipcoder.microlabs.mastering_loops;



@SuppressWarnings("ALL")
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder myRange = new StringBuilder();

        for (int i = 1; i <=5; i++){
            for (int n = 1; n <= 5; n++) {

                    myRange.append(String.format("%3d |", n * i));
                }
                myRange.append("\n");
            }

        return myRange.toString();
    }



    public static String getLargeMultiplicationTable() {
        StringBuilder myRange = new StringBuilder();

        for (int i = 1; i <=10; i++){
            for (int n = 1; n <= 10; n++) {

                myRange.append(String.format("%3d |", n * i));

            }
            myRange.append("\n");

        }

        return myRange.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder myRange = new StringBuilder();

        for (int i = 1; i <= tableSize; i++){
            for (int n = 1; n <= tableSize; n++) {

                myRange.append(String.format("%3d |", n * i));

            }
            myRange.append("\n");

        }

        return myRange.toString();
    }
}
