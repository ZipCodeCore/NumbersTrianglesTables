package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder smallTable = new StringBuilder();
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                smallTable.append(String.format("%3d |", i * k));
            }
            smallTable.append("\n");
        }
        return smallTable.toString();
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder smallTable = new StringBuilder();
        int size = 10;

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                smallTable.append(String.format("%3d |", i * k));
            }
            smallTable.append("\n");
        }
        return smallTable.toString();

    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder smallTable = new StringBuilder();
        int size = tableSize;

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                smallTable.append(String.format("%3d |", i * k));
            }
            smallTable.append("\n");
        }
        return smallTable.toString();

    }
}
