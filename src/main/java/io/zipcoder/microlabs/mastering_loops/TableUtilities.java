package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder smt = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                int num = i * j;

                smt.append(String.format("%3d |", num));

            }
            smt.append("\n");

        }
        String myTable = smt.toString();
        return myTable;
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder theString = new StringBuilder();

        for (int i = 1; i<11; i++) {

            for (int j = 1; j<11; j++) {

                theString.append(String.format("%3d |", i * j));
            }
            theString.append("\n");
        }
        return theString.toString();
    }


    public static String getMultiplicationTable(int tableSize) {

        StringBuilder theString = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {

                theString.append(String.format("%3d |", i * j));
            }
            theString.append("\n");
        }
        return theString.toString();

    }
}