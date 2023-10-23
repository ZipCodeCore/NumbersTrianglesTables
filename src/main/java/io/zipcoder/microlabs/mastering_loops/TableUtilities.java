package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder builder = new StringBuilder();

        for (int row = 1; row <= 5; row++) {
            for(int col = 1; col <=5; col++) {
                int table = row * col;
                builder.append(String.format("%3d |", table));

            }

            builder.append("\n");

        }

        return builder.toString();
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder builder = new StringBuilder();

        for (int row = 1; row <= 10; row++) {
            for(int col = 1; col <=10; col++) {
                int table = row * col;
                builder.append(String.format("%3d |", table));

            }

            builder.append("\n");

        }

        return builder.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder builder = new StringBuilder();

        for (int row = 1; row <= tableSize; row++) {
            for(int col = 1; col <= tableSize; col++) {
                int table = row * col;
                builder.append(String.format("%3d |", table));

            }

            builder.append("\n");

        }

        return builder.toString();
    }
}
