package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        /*
        Description
        Generate a String representation of a multiplication table whose dimensions are 4 by 4
         */

        StringBuilder sbSmallMultiplicationTable = new StringBuilder();

        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                sbSmallMultiplicationTable.append( String.format("%3d |", (i * j)) );
                if (j == size) {
                    sbSmallMultiplicationTable.append("\n");
                }
            }
        }

        return sbSmallMultiplicationTable.toString();
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder sbLargeMultiplicationTable = new StringBuilder();

        int size = 10;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                sbLargeMultiplicationTable.append( String.format("%3d |", (i * j)) );
                if (j == size) {
                    sbLargeMultiplicationTable.append("\n");
                }
            }
        }
        return sbLargeMultiplicationTable.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder sbMultiplicationTable = new StringBuilder();

        int size = 20;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                sbMultiplicationTable.append( String.format("%3d |", (i * j)) );
                if (j == size) {
                    sbMultiplicationTable.append("\n");
                }
            }
        }
        return sbMultiplicationTable.toString();
    }
}
