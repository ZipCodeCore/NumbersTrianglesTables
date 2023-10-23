package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder multiTable = new StringBuilder();
        for (int i = 1; i < 6; i++){
            for (int j = 1; j < 6; j++){
                multiTable.append(String.format("%3d |", i * j));
            }
            multiTable.append("\n");
        }
        return multiTable.toString();
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multiTable = new StringBuilder();
        for (int i = 1; i < tableSize + 1; i++){
            for (int j = 1; j < tableSize + 1; j++){
                multiTable.append(String.format("%3d |", i * j));
            }
            multiTable.append("\n");
        }
        return multiTable.toString();
    }
}
