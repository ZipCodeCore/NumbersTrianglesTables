package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder getSmol = new StringBuilder();

        for (int r = 1; r <= tableSize; r++){

            for(int c = 1; c <= tableSize; c++){

                getSmol.append(String.format("%3d |", r*c));

            }

            getSmol.append("\n");
        }

        return getSmol.toString();
    }
}
