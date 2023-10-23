package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder tableOne = new StringBuilder();

        for (int a = 1; a <= 5; a++){
            for (int b = 1; b <= 5; b++){
                int product = a * b;
                tableOne.append(String.format("%3d |", product));
            }
            tableOne.append("\n");

        }
        return tableOne.toString();
    }


    public static String getLargeMultiplicationTable() {

        StringBuilder tableOne = new StringBuilder();

        for (int a = 1; a <= 10; a++){
            for (int b = 1; b <= 10; b++){
                int product = a * b;
                tableOne.append(String.format("%3d |", product));
            }
            tableOne.append("\n");

        }
        return tableOne.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder tableOne = new StringBuilder();

        for (int a = 1; a <= tableSize; a++){
            for (int b = 1; b <= tableSize; b++){
                int product = a * b;
                tableOne.append(String.format("%3d |", product));
            }
            tableOne.append("\n");

        }
        return tableOne.toString();
    }
}
