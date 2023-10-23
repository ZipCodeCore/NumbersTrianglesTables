package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder matrix = new StringBuilder();

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                matrix.append(String.format("%3d |", row * column));
            }
            matrix.append("\n");
        }

        return matrix.toString();
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder matrix = new StringBuilder();

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                matrix.append(String.format("%3d |", row * column));
            }
            matrix.append("\n");
        }

        return matrix.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder matrix = new StringBuilder();

        for (int row = 1; row <= 20; row++) {
            for (int column = 1; column <= 20; column++) {
                matrix.append(String.format("%3d |", row * column));
            }
            matrix.append("\n");
        }

        return matrix.toString();
    }
}